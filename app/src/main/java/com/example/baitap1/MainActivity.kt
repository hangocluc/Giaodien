package com.example.baitap1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.baitap1.modle.SecoundActivity
import com.example.baitap1.modle.ThreeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_singup.setOnClickListener {
            val intent = Intent(this, SecoundActivity::class.java)
            startActivity(intent);
        }

        txt_forgot.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val dialog = LayoutInflater.from(this).inflate(R.layout.activity_dialog2, null)
            builder.setView(dialog)
            val close = builder.create()
            close.show()
        }
        btn_login.setOnClickListener {
           val intent =Intent(this,ThreeActivity::class.java)
             val bundle = Bundle()
            intent.putExtra("m",bundle)
            startActivity(intent)
        }

    }
}
