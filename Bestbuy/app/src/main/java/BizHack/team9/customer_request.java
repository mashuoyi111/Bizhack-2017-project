package BizHack.team9;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

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