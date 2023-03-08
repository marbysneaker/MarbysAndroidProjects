package com.example.marbysandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycle_view_projects);



        Project[] projects = {

                new Project("Getting Started app","my project description",R.drawable.getting_started),
                new Project("Bmi Calculator","my project description",R.drawable.calculator),
                new Project("Inches converter","my project description",R.drawable.tape),
                new Project("Name getter app","my project description",R.drawable.quote),
                new Project("Developer Restaurant","my project description",R.drawable.hungry_developer)
        };

        ProjectsAdapter projectAdapter = new ProjectsAdapter(projects);

        list.setAdapter(projectAdapter);
    }

}