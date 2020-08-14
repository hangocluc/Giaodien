package com.example.baitap1.modle

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import com.example.baitap1.MainActivity
import com.example.baitap1.R
import kotlinx.android.synthetic.main.activity_secound.*

class Secound : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        txt_login_second.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent);
        }

























































        val spannable_name = SpannableString("Full name *")
        spannable_name.setSpan(
            ForegroundColorSpan(Color.RED),
            10, 11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        txt_fullname.text = spannable_name




        val spannable_adress = SpannableString("Email Address *")
        spannable_adress.setSpan(
            ForegroundColorSpan(Color.RED),
            14,15,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_adress_second.text= spannable_adress

        val spannable_number = SpannableString("Phone number *")
        spannable_number.setSpan(
            ForegroundColorSpan(Color.RED),
            13,14,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_number_second.text = spannable_number



        val spannable_password = SpannableString("Password *")
        spannable_password.setSpan(
            ForegroundColorSpan(Color.RED),
            9 ,10,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_password_second.text=spannable_password

        val spannable_confirm = SpannableString("Confirm Password *")
        spannable_confirm.setSpan(
            ForegroundColorSpan(Color.RED),
            17,18,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_confirm_second.text = spannable_confirm

    }

}
