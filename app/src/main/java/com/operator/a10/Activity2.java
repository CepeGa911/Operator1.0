package com.operator.a10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://rfnd.io/t/9qwae/?pid=306");

        WebViewClient webViewClient = new WebViewClient(){
            @SuppressWarnings("deprecation") @Override2
            public boolean sh(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }

            @TargetApi(Build.VERSION_CODES.N) @Override2
            public void shouldOverrideUrlloading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
            }
        };
        webView.setWebViewClient(webViewClient);
    }
}