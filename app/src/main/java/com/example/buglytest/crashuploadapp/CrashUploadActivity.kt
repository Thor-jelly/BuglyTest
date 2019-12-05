package com.example.buglytest.crashuploadapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.buglytest.R
import com.tencent.bugly.crashreport.CrashReport

class CrashUploadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crash_upload)

        //默认值
//        CrashReport.setUserId(null)//设置用户id
//        CrashReport.setUserSceneTag(this, -1)//设置标签

        //自定义值
//        CrashReport.setUserId("8888")
//        CrashReport.setUserSceneTag(this, 137082)

        //发送crash测试
//        CrashReport.testJavaCrash();

        //发送自定义错误信息
        val t = IllegalArgumentException("我是测试参数错误")
        CrashReport.postCatchedException(t)
    }
}
