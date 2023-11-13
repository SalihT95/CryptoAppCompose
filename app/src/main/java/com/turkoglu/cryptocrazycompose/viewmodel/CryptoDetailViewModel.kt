package com.turkoglu.cryptocrazycompose.viewmodel

import androidx.lifecycle.ViewModel
import com.turkoglu.cryptocrazycompose.model.Crypto
import com.turkoglu.cryptocrazycompose.repository.CryptoRepository
import com.turkoglu.cryptocrazycompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
): ViewModel() {

    //tıklanan coinin bilgilerini göster
    suspend fun getCrypto(id : String) : Resource<Crypto>{
        return repository.getCrypto(id)

    }


}