package com.example.lista3_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private Button bt;
    private TextView tvn;
    private EditText edn;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_new);
            getSupportActionBar().setTitle("Login");

            bt = (Button) findViewById(R.id.bt);
            tvn = (TextView) findViewById(R.id.tvn);
            edn = (EditText) findViewById(R.id.edn);

            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = edn.getText().toString();
                    Intent returnIntent = new Intent(NewActivity.this, MainActivity.class);
                    returnIntent.putExtra("name", name);
                    setResult(RESULT_OK, returnIntent);
                    finish();
                }
            });

        }
    }