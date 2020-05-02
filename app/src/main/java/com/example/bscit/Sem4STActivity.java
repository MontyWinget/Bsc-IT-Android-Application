package com.example.bscit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Sem4STActivity extends AppCompatActivity {

    private WebView webView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4_s_t);

        webView = (WebView)findViewById(R.id.sem4st);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/playlist?list=PLhSp9OSVmeyJdYAHtIbDlkBLG0G1wuosk");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.video);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.video:
                        return true;
                    case R.id.blog:
                        startActivity(new Intent(getApplicationContext()
                                ,Blog.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext()
                                ,Feedback.class));
                        overridePendingTransition(0, 0);
                        return true;
                }

                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
