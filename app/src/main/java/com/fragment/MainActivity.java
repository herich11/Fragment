package com.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add the fragment to the activity
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new TaskListFragment())
                .commit();
    }
}
