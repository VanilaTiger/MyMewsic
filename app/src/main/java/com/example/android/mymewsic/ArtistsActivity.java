package com.example.android.mymewsic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView current= (TextView) findViewById(R.id.current);
        // Set a click listener on that view
        current.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(ArtistsActivity.this, CurrentActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView library= (TextView) findViewById(R.id.library);

        // Set a click listener on that view
        library.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(ArtistsActivity.this, LibraryActivity.class);
                startActivity(recentIntent);
            }
        });

        TextView albums= (TextView) findViewById(R.id.albums);

        // Set a click listener on that view
        albums.setOnClickListener(new View.OnClickListener(){
            //The code to be executed when the numbers view is clicked on
            @Override
            public void onClick(View view){
                Intent recentIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(recentIntent);
            }
        });
    }
}
