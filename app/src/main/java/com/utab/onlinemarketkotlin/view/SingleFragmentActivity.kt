package com.utab.onlinemarketkotlin.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.utab.onlinemarketkotlin.R

abstract class SingleFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_container)
        if (fragment == null)
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, fragment()).commit()
    }

    abstract fun fragment(): Fragment
}