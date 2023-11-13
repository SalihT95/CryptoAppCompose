package com.turkoglu.cryptocrazycompose.repository

import com.turkoglu.cryptocrazycompose.model.Crypto
import com.turkoglu.cryptocrazycompose.model.CryptoList
import com.turkoglu.cryptocrazycompose.service.CryptoAPI
import com.turkoglu.cryptocrazycompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository@Inject constructor(
    private val api: CryptoAPI
) {

    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        } catch(e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch(e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }
}