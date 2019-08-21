package co.com.k4soft.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import co.com.k4soft.intent.util.ActionBarUtil;

public class Vista2Activity extends AppCompatActivity {

    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista2);
        initComponents();
        loadInfo();
    }

    private void loadInfo() {
        Intent intent = getIntent();
        txtNombre.setText(intent.getStringExtra("nombre"));
    }

    private void initComponents() {
        ActionBarUtil actionBarUtil = new ActionBarUtil(this);
        actionBarUtil.setToolBar("Activity 2","Esto es un ejemplo");
        txtNombre = findViewById(R.id.txtNombre);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
