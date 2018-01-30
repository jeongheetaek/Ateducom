package com.administrator.ateducom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText etEmail = (EditText) findViewById(R.id.etLogin);
        final EditText etpass = (EditText) findViewById(R.id.etPass);


        Button btnReg = (Button)findViewById(R.id.btnReg);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seEmail = etEmail.getText().toString();
                String sePass = etpass.getText().toString();

                Toast.makeText(MainActivity.this, seEmail+","+sePass, Toast.LENGTH_LONG).show();
            }
        });

        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // Toast.makeText(MainActivity.this, "GO Login", Toast.LENGTH_LONG).show();

                Intent go = new Intent(MainActivity.this, AfterActivity.class);
                startActivity(go);


            }
        });
    }
}
