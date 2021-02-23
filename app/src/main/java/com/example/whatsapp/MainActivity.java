package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
private TabLayout tablayout;
private ViewPager viewPager;
private Toolbar toolbar;
  ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);
        toolbar=findViewById(R.id.myToolBar);
         setSupportActionBar(toolbar);
         getSupportActionBar().setTitle("WhatsApp");
        viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());
        tablayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }
}