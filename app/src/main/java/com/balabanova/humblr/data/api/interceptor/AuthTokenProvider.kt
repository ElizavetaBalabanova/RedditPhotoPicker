package com.balabanova.humblr.data.api.interceptor

import android.content.Context
import com.balabanova.humblr.data.api.TOKEN_SHARED_KEY
import com.balabanova.humblr.data.sharedprefsservice.SharedPrefsService

class AuthTokenProvider(private val context: Context,
                        private val sharedPrefsService: SharedPrefsService
) {

    fun getToken() = sharedPrefsService.create(context)
        .getString(TOKEN_SHARED_KEY, "")
}
