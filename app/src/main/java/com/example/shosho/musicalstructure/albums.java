package com.example.shosho.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by shosho on 10/18/2017.
 */

public class albums extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.albums);

        Button albums_to_playing = (Button) findViewById(R.id.albums_to_playing);

        albums_to_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), playing.class);
                Toast.makeText(getBaseContext(),"you are in  playing page ",Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });
        Button albums_to_payment=(Button)findViewById(R.id.albums_to_payment);
        albums_to_payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),payment.class);

                startActivity(intent);
            }
        });
        // Button cs_to_main=(Button)findViewById(R.id.cs_to_mainpage);
        Button album_to_mainpage=(Button)findViewById(R.id.albums_to_mainpage);
        album_to_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),MainActivity.class);
                Toast.makeText(getBaseContext(),"you are in main page.",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

    }
}


