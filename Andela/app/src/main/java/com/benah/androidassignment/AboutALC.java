package com.benah.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class AboutALC extends AppCompatActivity {

    private final String str = getClass().getSimpleName();
    WebView view;
    String url = "https://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        view = findViewById(R.id.webView);
        view.loadUrl(url);
        view.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError err) {
                Log.e(str, "SSL Error" + handler.toString());
                handler.proceed();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
