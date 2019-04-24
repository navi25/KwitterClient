package io.navendra.kwitterclient.viewModels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import io.navendra.kwitterclient.data.WordItem
import io.navendra.kwitterclient.data.WordRepository

class WordViewModel(application: Application) : AndroidViewModel(application){

    val words : MutableLiveData<List<WordItem>> = MutableLiveData()

    val repository : WordRepository by lazy { WordRepository(application.applicationContext) }

    fun loadData(){
      words.postValue(repository.getAllWords())
    }

}