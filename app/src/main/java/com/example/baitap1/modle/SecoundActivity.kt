package com.example.baitap1.modle

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.baitap1.MainActivity
import com.example.baitap1.R
import com.example.baitap1.student.Student
import kotlinx.android.synthetic.main.activity_secound.*

class SecoundActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        txt_login_second.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
        }
        edt_fullname_second.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                under_line_full_name.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.holo_blue_light
                    )
                )
            } else {
                under_line_full_name.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.black
                    )
                )
            }
        }
        edt_adress_second.setOnFocusChangeListener { v, hasFocus ->

            if (hasFocus) {
                unlike_address.setBackgroundColor(
                    ContextCompat.getColor(
                        this, android.R.color.holo_blue_bright
                    )
                )
            } else {
                unlike_address.setBackgroundColor(
                    ContextCompat.getColor(
                        this, android.R.color.black
                    )
                )


            }

        }
        edt_number_second.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                unlike_number.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )


            } else {
                unlike_number.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.black
                    )
                )

            }
        }
        edt_password_second.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                unlike_pass.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )


            } else {
                unlike_pass.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.black
                    )
                )

            }
        }
        edt_confrim_secound.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                unlike_confrim.setBackgroundColor(
                    ContextCompat.getColor(this, android.R.color.holo_blue_bright)
                )
            } else {
                unlike_confrim.setBackgroundColor(
                    ContextCompat.getColor(
                        this,
                        android.R.color.black
                    )
                )

            }


        }

        button.setOnClickListener {
            var intent = Intent(this, ThreeActivity::class.java)
            var name = edt_fullname_second.text.trim()
            var address = edt_adress_second.text.trim()
            var number = edt_number_second.text.trim()

            var bundle = Bundle()
            bundle.putString("name", name.toString())
            bundle.putString("address", address.toString())
            bundle.putInt("number", number.toString().toInt())

            intent.putExtra("m", bundle)

            startActivity(intent);
        }


        val spannable_name = SpannableString("Full name *")
        spannable_name.setSpan(
            ForegroundColorSpan(Color.RED),
            10, 11,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_fullname.text = spannable_name


        val spannable_adress = SpannableString("Email Address *")
        spannable_adress.setSpan(
            ForegroundColorSpan(Color.RED),
            14, 15,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_adress_second.text = spannable_adress

        val spannable_number = SpannableString("Phone number *")
        spannable_number.setSpan(
            ForegroundColorSpan(Color.RED),
            13, 14,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_number_second.text = spannable_number


        val spannable_password = SpannableString("Password *")
        spannable_password.setSpan(
            ForegroundColorSpan(Color.RED),
            9, 10,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_password_second.text = spannable_password

        val spannable_confirm = SpannableString("Confirm Password *")
        spannable_confirm.setSpan(
            ForegroundColorSpan(Color.RED),
            17, 18,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txt_confirm_second.text = spannable_confirm

    }

    fun update(student: Student) {

        val intent = Intent(this, ThreeActivity::class.java)
        val bundle: Bundle = Bundle()
        bundle.putString("name", student.name)
        bundle.putString("address", student.address)
        bundle.putInt("number", student.number)
        intent.putExtra("m", bundle)

        startActivity(intent)


    }
}
