package cl.sulcansystem.asynccoroutinas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels

const val tag = "My Tag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MyViewModel by viewModels()
        viewModel.getImage()


    }
}

