package co.com.k4soft.intent.util;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class ActionBarUtil {

    private final AppCompatActivity appCompatActivity;


    public ActionBarUtil(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }


    public void setToolBar(String titulo, String subtitulo) {
        if (appCompatActivity.getSupportActionBar() != null) {
            appCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            appCompatActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
            appCompatActivity.getSupportActionBar().setTitle(titulo);
            appCompatActivity.getSupportActionBar().setSubtitle(subtitulo);
        }
    }

    public void hideActionBar() {
        ActionBar actionBar = appCompatActivity.getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

}
