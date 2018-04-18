package com.example.shosho.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



/**
 * Created by shosho on 10/18/2017.
 */

public class payment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        Button payment_to_playing = (Button) findViewById(R.id.payment_to_playing);

        payment_to_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), playing.class);
                Toast.makeText(getBaseContext(), "you are in  playing page ", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });
        Button payment_to_albums = (Button) findViewById(R.id.payment_to_albums);
        payment_to_albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), albums.class);
                Toast.makeText(getBaseContext(), "you are in albums page.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        Button payment_to_mainpage = (Button) findViewById(R.id.payment_to_mainpage);
        payment_to_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                Toast.makeText(getBaseContext(), "you are in main page.", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
    }
}
