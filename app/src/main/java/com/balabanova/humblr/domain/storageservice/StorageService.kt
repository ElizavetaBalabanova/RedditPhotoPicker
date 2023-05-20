package com.balabanova.humblr.domain.storageservice

interface StorageService {
    fun saveEncryptedToken(data: String)
    fun save(key: String, data: Any?)
    fun load(key: String): Boolean
}
