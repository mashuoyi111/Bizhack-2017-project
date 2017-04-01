package com.example.ma.myapplication;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * A login screen that offers login via email/password.
 */
public class Dict extends AppCompatActivity {
    public static boolean hack=false;
    static EditText text1;
    @Override
    protected void onResume (){
        super.onResume();
        if(hack) text1.setText("10445226: Canon powershot SX620");
        hack=false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        ImageButton camera = (ImageButton) findViewById(R.id.camera);
        camera.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Dict.this, camera_tutorial.class);
                startActivity(int1);
            }
        });

        Button Blueshirt = (Button) findViewById(R.id.blue);
        Blueshirt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Dict.this, customer_request.class);
                startActivity(int1);
            }
        });

        text1 = (EditText) findViewById(R.id.product);

    };




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void goToProduct(View v){
        Intent int1 = new Intent(Dict.this, bestbuy_api.class);
        startActivity(int1);
    }



}

