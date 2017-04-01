package com.example.ma.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ma.myapplication.R;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Ma on 2017/3/31.
 */


public class customer_request extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_request);
    }

    public void addRequest(View view) {
        GetAsyncTask g=new GetAsyncTask();
        g.url="add.do";
        g.execute();
        Button b=(Button) findViewById(R.id.buttonAddRequest);
        b.setVisibility(View.INVISIBLE);
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                    getRequest();

            }
        }, 0, 1000);
    }

    public void setTextview(String s){
        TextView t=(TextView) findViewById(R.id.textView);
        t.setText(s);
    }

    public void getRequest() {
        customer_request.GetAsyncTask g=new customer_request.GetAsyncTask();
        g.url="getans.do";
        g.execute();
    }

    class GetAsyncTask extends AsyncTask<String, Void, String> {
        public String url="";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected String doInBackground(String... urls) {
            HttpResponse response=null;
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {

                //------------------>>
                HttpGet httpGet = new HttpGet("http://192.168.0.233:8080/website/"+url);
                HttpClient httpclient = new DefaultHttpClient();
                response = httpclient.execute(httpGet);

                response.getEntity().writeTo(out);
                // StatusLine stat = response.getStatusLine();




            } catch (IOException e) {
                e.printStackTrace();
            }

            return out.toString();

        }
        @Override
        protected void onPostExecute(String result) {
            setTextview(result);
        }
    }
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