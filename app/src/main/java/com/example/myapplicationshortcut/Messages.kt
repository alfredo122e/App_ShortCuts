package com.example.myapplicationshortcut


import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class Messages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val myWebView: WebView = findViewById(R.id.WebView1)
        myWebView.loadUrl("https://ugb.instructure.com/")

        myWebView.webViewClient = WebViewClient()
    }
}