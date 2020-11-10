package com.example.appconn_telenor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.appconn_telenor.app_level_fragments.chatsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.example.appconn_telenor.app_level_fragments.*;

public class homeScreen extends AppCompatActivity {

    ActionBar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        toolbar= getSupportActionBar();
        final BottomNavigationView bottomNavigationView= findViewById(R.id.navigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //toolbar.setTitle("Home");
        loadFragment(new homeFragment());

    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    ////bottom nav bar

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home:
                    loadFragment(new homeFragment());
                    //toolbar.setTitle("Home");
                    return true;
                case R.id.chats:
                    loadFragment(new chatsFragment());
                    //toolbar.setTitle("Chats");
                    return true;
                case R.id.recognition:
                    loadFragment(new RecognitionFragment());
                    //toolbar.setTitle("Recognition");
                    return true;
                case R.id.profile:
                    loadFragment(new ProfileFragment());
                    //toolbar.setTitle("Profile");
                    return true;
            }
            return false;
        }
    };

    ///
}