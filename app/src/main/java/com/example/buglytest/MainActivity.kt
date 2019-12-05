package com.example.buglytest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.buglytest.crashuploadapp.CrashUploadActivity
import com.tencent.bugly.beta.Beta
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        update_app_tv.setOnClickListener {
            //检查更新
            Log.d("123===", "检查是否可以更新=")
            /*
             * @param isManual  用户手动点击检查，非用户点击操作请传false
             * @param isSilence 是否显示弹窗等交互，[true:没有弹窗和toast] [false:有弹窗或toast]
             */
            try {
                Beta.checkUpgrade(true, false)
            } catch (e: Exception) {
                Log.d("123===", "========检查是否可以更新异常=")
            }
        }
        hotfix_update_app_tv.setOnClickListener {
            Log.d("123===", "这是热更新测试11111111111111111111111111111111111111")
        }
        crash_upload_app_tv.setOnClickListener {
            //自定义异常上报测试
            startNewActivity(CrashUploadActivity::class.java)
        }

        apply_path_tv.setOnClickListener {
            //应用补丁
            Beta.applyDownloadedPatch()
        }
    }

    private fun startNewActivity(java: Class<*>) {
        startActivity(Intent(this, java))
    }
}
