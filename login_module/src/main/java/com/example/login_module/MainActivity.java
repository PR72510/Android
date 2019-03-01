package com.example.login_module;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String email, pass;
        final EditText editText1, editText2;
        Button b_login;
        editText1 = findViewById(R.id.email_ET);
        editText2 = findViewById(R.id.pass_ET);
        b_login = findViewById(R.id.login);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email, pass;
                email = editText1.getText().toString();
                pass = editText2.getText().toString();

                loginCheck(email, pass);
            }
        });
    }

    public void loginCheck(String email, String pass){
        if(email.toLowerCase().equals("admin") && pass.toLowerCase().equals("admin123")){
            Intent intent = new Intent(MainActivity.this, targetActivity.class);
            intent.putExtra("Value1", email);
            intent.putExtra("value2", email);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Incorrect Credentials", Toast.LENGTH_LONG).show();
        }
    }
    }


