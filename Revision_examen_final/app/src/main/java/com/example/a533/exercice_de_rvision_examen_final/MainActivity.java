package com.example.a533.exercice_de_rvision_examen_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    private void setListener(){
        findViewById(R.id.btn_q1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToQuestion1();
            }
        });
        findViewById(R.id.btn_q2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToQuestion2();
            }
        });
        findViewById(R.id.btn_q3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendToQuestion3();
            }
        });
    }

    private void sendToQuestion1(){
        Intent sendToQuestion1 = new Intent(this, Question_1.class);
        startActivity(sendToQuestion1);
    }

    private void sendToQuestion2(){
        Intent sendToQuestion2 = new Intent(this, Question_2.class);
        startActivity(sendToQuestion2);
    }

    private void sendToQuestion3(){
        Intent sendToQuestion3 = new Intent(this, Question_3.class);
        startActivity(sendToQuestion3);
    }
}
