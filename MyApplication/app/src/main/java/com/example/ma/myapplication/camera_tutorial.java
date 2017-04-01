package com.example.ma.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ma on 2017/4/1.
 */

public class camera_tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_tutorial);
    }

    public void goToCamera(View v){
        Intent int1 = new Intent(camera_tutorial.this, Cameraa.class);
        startActivity(int1);
    }

}
