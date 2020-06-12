package com.androindian.checkboxkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked==true){
                textview.setText("Checked")
                Toast.makeText(this@MainActivity,"Checked",Toast.LENGTH_LONG).show()
            }else{
                textview.setText("Unchecked")
                Toast.makeText(this@MainActivity,"UnChecked",Toast.LENGTH_LONG).show()
            }


        }
    }
}
