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

public class Feedback extends AppCompatActivity {

    private WebView webView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        webView = (WebView)findViewById(R.id.feed);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfIWhiJi4B71_z9rtXB19KSiJsLBkBV32tJC8D69FiIiMzqoQ/viewform?usp=sf_link");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.feedback);

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
                        startActivity(new Intent(getApplicationContext()
                                ,Videos.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.blog:
                        startActivity(new Intent(getApplicationContext()
                                ,Blog.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
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
            startActivity(new Intent(getApplicationContext()
                    ,MainActivity.class));
            overridePendingTransition(0, 0);
        }
        finish();
    }
}
