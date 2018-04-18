package com.example.shosho.musicalstructure;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play_mainpage = (Button) findViewById(R.id.play_in_mainpage);

        play_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, playing.class);
                Toast.makeText(getBaseContext(), "you are in playing page. ", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });
        Button album_mainpage = (Button) findViewById(R.id.albums_in_mainpage);
        album_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, albums.class);
                Toast.makeText(getBaseContext(), "you are in albums page..", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });

        Button payment_mainpage = (Button) findViewById(R.id.payment_in_mainpage);

        payment_mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, payment.class);
                Toast.makeText(getBaseContext(), "you are in payment page. ", Toast.LENGTH_LONG).show();

                startActivity(intent);
            }
        });
    }

}
