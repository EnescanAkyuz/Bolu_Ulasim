package com.example.testt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    BottomNavigationView btm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragLay, new fragmentAnasayfa()).commit();
        btm = findViewById(R.id.bottom);
        btm.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item1) {
                switch (item1.getItemId()){

                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragLay, new fragmentAnasayfa()).commit();
                        break;
                    case R.id.kullanici:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragLay, new FragmentUser()).commit();
                        break;
                    case R.id.maps:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragLay, new MapsFragment()).commit();

                }
                return true;
            }
        });

    }
}