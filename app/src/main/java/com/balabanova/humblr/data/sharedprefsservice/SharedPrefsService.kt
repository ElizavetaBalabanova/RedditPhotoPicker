package com.balabanova.humblr.data.sharedprefsservice

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.balabanova.humblr.data.api.TOKEN_ENABLED_KEY
import com.balabanova.humblr.data.api.TOKEN_SHARED_KEY
import com.balabanova.humblr.data.api.TOKEN_SHARED_NAME
import com.balabanova.humblr.domain.storageservice.StorageService
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPrefsService @Inject constructor(@ApplicationContext context: Context) :
    StorageService {

    private val sharedPreferences = create(context)

    override fun save(key: String, data: Any?) {
        sharedPreferences.save(key, data)
    }

    override fun load(key: String): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }

    fun create(context: Context): SharedPreferences {
        val masterKey = MasterKey.Builder(context)
            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
            .build()

        return EncryptedSharedPreferences.create(
            context,
            TOKEN_SHARED_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }

    override fun saveEncryptedToken(data: String) {
        save(TOKEN_ENABLED_KEY, true)
        return sharedPreferences.edit().putString(TOKEN_SHARED_KEY, data).apply()
    }

    private fun SharedPreferences.save(key: String, value: Any?) {
        val edit = this.edit()
        if (value is String)
            edit.putString(key, value).apply()
        if (value is Boolean)
            edit.putBoolean(key, value).apply()
        edit.commit() || throw Exception("Could not save $value to SharedPreferences")
    }
}
