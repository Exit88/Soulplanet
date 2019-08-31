package com.example.soulplanet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import me.haowen.soulplanet.view.SoulPlanetsView;

public class MainActivity extends AppCompatActivity {
    private SoulPlanetsView soulPlanet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soulPlanet = findViewById(R.id.soulPlanetView);
        soulPlanet.setAdapter(new SoulAdapter());

        soulPlanet.setOnTagClickListener(new SoulPlanetsView.OnTagClickListener() {
            @Override
            public void onItemClick(ViewGroup parent, View view, int position) {
                Toast.makeText(MainActivity.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
