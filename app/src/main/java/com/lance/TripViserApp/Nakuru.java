package com.lance.TripViserApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Nakuru extends AppCompatActivity {

    Button next, prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nakuru);

        next = findViewById(R.id.next);
        prev = findViewById(R.id.prev);

        next.setVisibility(View.GONE);

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityIntent = new Intent(getApplicationContext(), masaimara.class);
                startActivity(activityIntent);
            }
        });

}
}
