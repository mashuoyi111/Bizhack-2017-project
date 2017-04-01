package BizHack.team9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {
    private String storeLocn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        // set store locn depending on gps activity
        storeLocn = "Granville";

        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setContentView(R.layout.activity_main_menu);
                // submit info (pass storelocn and change to main menu view)

            }
        });

        Button changeLocn = (Button) findViewById(R.id.button3);
        changeLocn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_location_map);
                // choose new store locn on map and set as storelocn
                storeLocn = "Metrotown";
            }
        });


    }
}





}