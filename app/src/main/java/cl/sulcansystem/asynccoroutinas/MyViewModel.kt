package cl.sulcansystem.asynccoroutinas

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    val repository = Repository()
    val url = "https://apod.nasa.gov/apod/image/1908/M61-HST-ESO-S1024.jpg"

    fun getImage() {
        viewModelScope.launch {
            val resul = repository.downloadImageFromNetwork(url)

            Log.d(tag, resul.toString())
        }
    }
}