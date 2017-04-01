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
import android.widget.ImageButton;

/**
 * A login screen that offers login via email/password.
 */
public class Dict extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        ImageButton camera = (ImageButton) findViewById(R.id.camera);
        camera.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Dict.this, Cameraa.class);
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



}

