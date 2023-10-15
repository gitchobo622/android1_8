package com.chobo.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.chobo.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.webview.settings.javaScriptEnabled = true // 자바 스크립트 허용
        binding.webview.webViewClient = WebViewClient()
        binding.webview.webChromeClient = WebChromeClient()
        //웹뷰에서 새창이 뜨지 않도록 방지하는 구문 위쪽
        binding.webview.loadUrl("https://www.naver.com") //링크 주소를 Load함
    }

    override fun onBackPressed() {
        if(binding.webview.canGoBack()){
            binding.webview.goBack()
        } else {
        super.onBackPressed()
    }
}
}