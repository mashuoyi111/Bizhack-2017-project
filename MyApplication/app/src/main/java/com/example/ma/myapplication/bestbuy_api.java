package com.example.ma.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Ma on 2017/4/1.
 */

public class bestbuy_api extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bestbuy_api);
//    }
//
//    public void addRequest(View view) {
//        GetAsyncTask g=new GetAsyncTask();
//        EditText e=(EditText) findViewById(R.id.apieditText);
//        g.web_id=e.getText().toString();
//        g.execute();
//
//    }
//
//    public void setTextview(String s){
//        TextView t=(TextView) findViewById(R.id.apitextView);
//        t.setText(s);
//    }
//
//    class GetAsyncTask extends AsyncTask<String, Void, String> {
//        public String web_id="";
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//
//        }
//
//        @Override
//        protected String doInBackground(String... urls) {
//            HttpResponse response=null;
//            ByteArrayOutputStream out = new ByteArrayOutputStream();
//            try {
//
//                //------------------>>
//                HttpGet httpGet = new HttpGet("https://msi.bbycastatic.ca/mobile-si/si/v4/pdp/overview/"+web_id);
//                HttpClient httpclient = new DefaultHttpClient();
//                response = httpclient.execute(httpGet);
//
//                response.getEntity().writeTo(out);
//                // StatusLine stat = response.getStatusLine();
//
//
//
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return out.toString().substring(0,100);
//
//        }
//        @Override
//        protected void onPostExecute(String result) {
//            setTextview(result);
//        }
//    }


}