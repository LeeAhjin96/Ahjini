package com.wato.widget

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<View>(R.id.button1) as Button
        button1.setOnClickListener {
            var versionArray = arrayOf("오레오", "파이", "큐(10)")
            var checkArray = booleanArrayOf(true, false, false)
            var dlg = AlertDialog.Builder(this@MainActivity)
            dlg.setTitle("좋아하는 버전은?")
            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setMultiChoiceItems(versionArray, checkArray) {dialog,which,isChecked ->
                button1.text = versionArray[which]
            }
            dlg.setPositiveButton("닫기", null)
            dlg.show()
        }


//        button1.setOnClickListener {
//            var versionArray = arrayOf("오레오","파이","큐(10)")
//            var dlg = AlertDialog.Builder(this@MainActivity)
//            dlg.setTitle("좋아하는 건?")
//            dlg.setIcon(R.mipmap.ic_launcher)
//            dlg.setItems(versionArray) { dialog, which ->
//                button1.text = versionArray[which]
//            }
//            dlg.setPositiveButton("닫기",null)
//            dlg.show()
//        }


    }
}