package com.example.ma.myapplication;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
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
    private View mProgressView;
    public static boolean hack=false;
    static EditText text1;
    @Override
    protected void onResume (){
        super.onResume();
        if(hack) {

            showProgress(true);

            hack=false;
        }
    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime)*4;
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    //mProgressView.setVisibility(show ? View.VISIBLE. : View.GONE);
                    mProgressView.setVisibility(View.GONE);
                    text1.setText("10445226: Canon powershot SX620");
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dict);

        mProgressView = findViewById(R.id.login_progress);
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

        Button chat = (Button) findViewById(R.id.chat);
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

