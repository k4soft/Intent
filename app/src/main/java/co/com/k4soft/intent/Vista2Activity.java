package co.com.k4soft.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.com.k4soft.intent.util.ActionBarUtil;

public class Vista2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
        ActionBarUtil actionBarUtil = new ActionBarUtil(this);
        actionBarUtil.setToolBar("Activity 2","Esto es un ejemplo");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
