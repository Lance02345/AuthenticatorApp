package com.lance.TripViserApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    Button next;
    Button prev;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);
        image = findViewById(R.id.imageView);

        next.setOnClickListener(view -> {
            Intent activityIntent = new Intent(getApplicationContext(), masaimara.class);
            startActivity(activityIntent);
        });


        prev.setVisibility(View.GONE);

        image.setOnClickListener(view -> {
            Intent activityIntent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(activityIntent);
        });


    }

}
