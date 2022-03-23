package com.example.lista3_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button bt2;
    private TextView tv;
    private static final int NewActivityRequest = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Início");

        tv = (TextView) findViewById(R.id.tv);
        bt2 = (Button) findViewById(R.id.bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivityForResult(intent, NewActivityRequest);
            }
        });
    }

    @Override
    protected void onActivityResult(int RequestCode, int ResultCode, Intent data) {
        super.onActivityResult(RequestCode, ResultCode, data);
        if (RequestCode == NewActivityRequest) {
            if (ResultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                tv.setText("Seja bem-vindo " + name);
            }
        }
    }
}