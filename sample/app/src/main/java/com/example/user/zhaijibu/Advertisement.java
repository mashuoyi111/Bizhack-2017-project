package com.example.user.zhaijibu;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Advertisement extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);

        button =(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Advertisement.this, "click button", Toast.LENGTH_SHORT).show();
                Intent int1=new Intent(Advertisement.this,LoginActivity.class);
                startActivity(int1);
            }
        });
    }


}