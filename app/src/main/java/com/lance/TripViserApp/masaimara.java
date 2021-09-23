package com.lance.TripViserApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class masaimara extends AppCompatActivity {

    Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masaimara);

        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);

        next.setOnClickListener(view -> {
            Intent activityIntent = new Intent(getApplicationContext(), Nakuru.class);
            startActivity(activityIntent);
        });

        prev.setOnClickListener(view -> {
            Intent activityIntent = new Intent(getApplicationContext(), Homepage.class);
            startActivity(activityIntent);
        });

    }
}
