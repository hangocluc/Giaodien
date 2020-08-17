package com.example.baitap1.modle

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.baitap1.R
import kotlinx.android.synthetic.main.activity_three.*

class ThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        var intent: Intent = getIntent()
        var bundle: Bundle = intent.getBundleExtra("m")
        if (bundle!= null) {
            var name = bundle.getString("name")
            var address = bundle.getString("address")
            var number = bundle.getInt("number")
            edt_fullname_three.setText(name.toString())
            edt_adress_three.setText(address.toString())
            edt_number_three.setText(number.toString())
        }else{
            edt_fullname_three.setText("")
            edt_adress_three.setText("")
            edt_number_three.setText("")


        }

        edt_fullname_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_fullname_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_fullname_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }
        edt_adress_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_address_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_address_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }

        edt_number_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_number_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_number_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }
        edt_curentpass_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_curentpass_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_number_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }
        edt_password_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_pass_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_pass_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }

        edt_confrim_three.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_confrm_three.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )

            }else{
                unlike_confrm_three.setBackgroundColor(
                    ContextCompat.getColor(this,android.R.color.black)
                )

            }
        }
        //mau dau *
        val spannable_name = SpannableString("Full Name *")
        spannable_name.setSpan(
            ForegroundColorSpan(Color.RED),
            10, 11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE

        )
        txt_fullname_three.text = spannable_name

        val spannable_address = SpannableString("Email Address *")
        spannable_address.setSpan(
            ForegroundColorSpan(Color.RED),
            13, 15,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE

        )
        txt_adress_three.text = spannable_address
        val spannable_phone = SpannableString("Phone Number *")
        spannable_phone.setSpan(
            ForegroundColorSpan(Color.RED),
            13, 14,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE

        )
        txt_number_three.text = spannable_phone
    }
}
