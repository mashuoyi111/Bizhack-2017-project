package com.example.ma.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addRequest(View view) {
        GetAsyncTask g=new GetAsyncTask();
        g.url="add.do";
        g.execute();

    }

    public void getRequest(View view) {
        GetAsyncTask g=new GetAsyncTask();
        g.url="get.do";
        g.execute();
    }

    public void setTextview(String s){
        TextView t=(TextView) findViewById(R.id.textView);
        t.setText(s);
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
                HttpGet httppost = new HttpGet("http://192.168.0.233:8080/website/"+url);
                HttpClient httpclient = new DefaultHttpClient();
                response = httpclient.execute(httppost);

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

}
