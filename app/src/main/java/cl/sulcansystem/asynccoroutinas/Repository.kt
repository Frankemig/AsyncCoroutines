package cl.sulcansystem.asynccoroutinas

import android.graphics.Bitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {

    suspend fun downloadImageFromNetwork(url:String):Bitmap?= withContext(Dispatchers.Default){
        val urldisplay = url
        var bmp : Bitmap? = null

        bmp

    }
}