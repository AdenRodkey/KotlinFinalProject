package com.hfad.rodkey_cit382_finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val Menu = MenuFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flfragment, Menu)
            commit()
        }


    }

}
