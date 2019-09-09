package com.example.buglytest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.buglytest.crashuploadapp.CrashUploadActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        update_app_tv.setOnClickListener {

        }
        hotfix_update_app_tv.setOnClickListener {

        }
        crash_upload_app_tv.setOnClickListener {
            startNewActivity(CrashUploadActivity::class.java)
        }
    }

    private fun startNewActivity(java: Class<*>) {
        startActivity(Intent(this, java))
    }
}
