package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.cevap);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this); // b tıklandığında bunu dinlesin
    }

    @Override
    public void onClick(View view) {
       tv.setText(R.string.bilmece_cevabı);
    }
}