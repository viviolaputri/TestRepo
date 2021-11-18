package com.example.testrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateDescription(): CharSequence? {
        return super.onCreateDescription()
    }

    override fun onContextMenuClosed(menu: Menu) {
        super.onContextMenuClosed(menu)
    }
}