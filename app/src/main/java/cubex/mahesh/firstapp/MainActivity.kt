package cubex.mahesh.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getText(v:View){
        val et :EditText = findViewById(R.id.et1)
        val tv:TextView = findViewById(R.id.tv1)
       // tv.setText(et.getText())
        tv.text = et.text
    }
}
