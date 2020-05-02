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

public class Blog extends AppCompatActivity {

    private WebView myWebView;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        myWebView = (WebView)findViewById(R.id.blogWebview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://www.computerweekly.com/blogs");
        myWebView.setWebViewClient(new WebViewClient());

        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.blog);

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
        if (myWebView.canGoBack()){
            myWebView.goBack();
        }else {
            startActivity(new Intent(getApplicationContext()
                    ,MainActivity.class));
            overridePendingTransition(0, 0);
        }
        finish();
    }
}
