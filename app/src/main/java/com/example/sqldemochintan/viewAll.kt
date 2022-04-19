package com.example.sqldemochintan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_all.*

class viewAll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all)
        updateRecycleView()
    }

    private fun updateRecycleView() {
        var db=Dbhelper(this)
        var arr=db.retriveAll()
        var fruit_adapter=PersonAdapter(this,arr)
        myrecycle.adapter=fruit_adapter
    }
}