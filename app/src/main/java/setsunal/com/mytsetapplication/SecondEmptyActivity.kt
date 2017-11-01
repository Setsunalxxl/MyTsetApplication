package setsunal.com.mytsetapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SecondEmptyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_empty)
        val a = 10 / 0
    }
}
