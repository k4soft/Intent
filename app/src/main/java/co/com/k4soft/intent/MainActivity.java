package co.com.k4soft.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents() {
        txtNombre = findViewById(R.id.txtNombre);
    }

    public void goToVista2(View view) {
        String nombre = txtNombre.getText().toString();
        if(nombreNotEmpty(nombre)){
            Intent intent = new Intent(getApplicationContext(),Vista2Activity.class);
            intent.putExtra("nombre",nombre);
            startActivity(intent);
        }else{
            txtNombre.setError(getString(R.string.requerido));
        }

    }

    private boolean nombreNotEmpty(String nombre) {
        return !"".equals(nombre);
    }
}
