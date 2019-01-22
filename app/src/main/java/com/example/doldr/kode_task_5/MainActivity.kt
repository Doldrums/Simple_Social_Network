package com.example.doldr.kode_task_5


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()

        btn_login.setOnClickListener {
            val login = txt_login.text.toString()
            val password = txt_password.text.toString()
            when {
                login == "test" && password == "test" -> {
                    intent = Intent(this,FeedActivity::class.java)
                    startActivity(intent)
                }
                login == "" && password == "" -> Snackbar.make(it,"Введите что-нибудь",Snackbar.LENGTH_LONG).show()
                login == "" -> Snackbar.make(it,"Введите логин",Snackbar.LENGTH_LONG).show()
                password == "" -> Snackbar.make(it,"Введите пароль",Snackbar.LENGTH_LONG).show()
                password != "test" || login != "test" -> Snackbar.make(it,"Неверный пароль или логин",Snackbar.LENGTH_LONG).show()
            }
        }


    }
}
