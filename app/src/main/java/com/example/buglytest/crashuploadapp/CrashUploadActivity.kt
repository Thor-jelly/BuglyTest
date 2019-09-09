package com.example.buglytest.crashuploadapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.buglytest.R
import com.tencent.bugly.crashreport.CrashReport

class CrashUploadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crash_upload)
        CrashReport.testJavaCrash();
    }
}
