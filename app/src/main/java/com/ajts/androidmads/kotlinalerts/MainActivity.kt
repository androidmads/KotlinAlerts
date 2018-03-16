package com.ajts.androidmads.kotlinalerts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showNormalAlert(v: View){
        val dialog = AlertDialog.Builder(this).setTitle("Kotlin Study").setMessage("Alert Dialog")
                .setPositiveButton("Confirm", { dialog, i ->
                    Toast.makeText(this@MainActivity, "Hello Friends", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton("Cancel", { dialog, i -> })
        dialog.show()
    }

    fun showListAlert(v: View){
        val items = arrayOf<CharSequence>("Android", "iOS", "Windows")
        val dialog = AlertDialog.Builder(this).setTitle("Select your Mobile OS").setItems(items,
                {
                    dialog, which ->
                    Toast.makeText(applicationContext, items[which], Toast.LENGTH_LONG).show();
                })
        dialog.show()
    }
}
