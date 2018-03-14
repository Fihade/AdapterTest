package com.mila.adaptertest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewTestActivity extends AppCompatActivity {
    private String url="https://www.baidu.com/";
    private WebView wb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_test);
//        Uri uri = Uri.parse(url);
//        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(intent);
          init();
    }

    private void init() {
        wb = findViewById(R.id.webview);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setSupportZoom(true);
        wb.getSettings().setBuiltInZoomControls(false);
        wb.getSettings().setDefaultFontSize(18);
        wb.loadUrl("https://www.baidu.com");
        wb.setWebViewClient(new WebViewClient(){

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                wb.loadUrl(url);
                return true;
                //return super.shouldOverrideUrlLoading(view,url);
            }

        });
    }
}
