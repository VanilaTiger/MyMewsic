package com.example.android.mymewsic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView login= (TextView) findViewById(R.id.login);

        // Set a click listener on that view
        login.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                startActivity(recentIntent);
            }
        });
    }
}
