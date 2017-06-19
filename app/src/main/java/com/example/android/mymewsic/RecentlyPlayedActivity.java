package com.example.android.mymewsic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        TextView current= (TextView) findViewById(R.id.current);
        // Set a click listener on that view
        current.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(RecentlyPlayedActivity.this, CurrentActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView library= (TextView) findViewById(R.id.library);

        // Set a click listener on that view
        library.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(RecentlyPlayedActivity.this, LibraryActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView artists= (TextView) findViewById(R.id.artists);

        // Set a click listener on that view
        artists.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(RecentlyPlayedActivity.this, ArtistsActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView albums= (TextView) findViewById(R.id.albums);

        // Set a click listener on that view
        albums.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(RecentlyPlayedActivity.this, AlbumsActivity.class);
                startActivity(recentIntent);
            }
        });
    }
}
