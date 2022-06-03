package com.example.myapplicationshortcut


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Students : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messages)

        val myWebView: WebView = findViewById(R.id.WebView2)
        myWebView.loadUrl("https://estudiantes.ugb.edu.sv/")

        myWebView.webViewClient = WebViewClient()
    }
}