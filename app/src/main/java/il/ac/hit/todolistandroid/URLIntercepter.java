package il.ac.hit.todolistandroid;

import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.Date;

public class URLIntercepter extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}