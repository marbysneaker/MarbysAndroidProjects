package com.example.marbysandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project gettingStartedProject = new Project("my project","my project description",1234);

        Project[] projects = {

                new Project("Getting Started app","my project description",1234),
                new Project("Bmi Calculator","my project description",1234),
                new Project("Inches converter","my project description",1234),
                new Project("Name getter app","my project description",1234),
                new Project("Developer Restaurant","my project description",1234)
        };

    }

}