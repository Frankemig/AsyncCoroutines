package cl.sulcansystem.asynccoroutinas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

const val tag = "My Tag"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel: MyViewModel by viewModels()
        viewModel.getImage().observe(this,{
            Log.d(tag,"En la vista >>>> $it")
            imgOfDay.setImageBitmap(it)
        })


    }
}

