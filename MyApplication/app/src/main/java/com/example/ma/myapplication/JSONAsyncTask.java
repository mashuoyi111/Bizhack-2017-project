package com.example.ma.myapplication;

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Ma on 2017/3/31.
 */

class JSONAsyncTask extends AsyncTask<String, Void, String> {


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
            HttpGet httppost = new HttpGet("http://192.168.0.233/website/add.do");
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

    }
}