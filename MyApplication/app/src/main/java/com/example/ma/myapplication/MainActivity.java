package com.example.ma.myapplication;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton registerButton = (ImageButton) findViewById(R.id.map1);
        registerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Maps.class);
                startActivity(int1);
            }
        });

        Button confirmButton = (Button) findViewById(R.id.button1);
        confirmButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Dict.class);
                startActivity(int1);
            }
        });


    }

    public void toEmployee(View v){
        Intent int1 = new Intent(MainActivity.this, employee_request.class);
        startActivity(int1);
    }
}
