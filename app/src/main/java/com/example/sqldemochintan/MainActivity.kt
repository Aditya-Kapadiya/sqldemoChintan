package com.example.sqldemochintan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btninsert.setOnClickListener {
            var name=edtfrname.text.toString()
            var des=edtdes.text.toString()
            var price=edtprice.text.toString().toInt()
            var fruit=Fruit(name,des,price)
            var fruitdb=Dbhelper(this)
            var flag=fruitdb.insert(fruit)
            edtfrname.setText("")
            edtdes.setText("")
            edtprice.setText("")
            if(flag)
            {
                Toast.makeText(this,"record inserted!",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Error!",Toast.LENGTH_LONG).show()
            }

        }

        btnviewall.setOnClickListener {

            var intent:Intent=Intent(this,viewAll::class.java)
            startActivity(intent)
        }
    }
}