package com.example.recyclerviewscourseperformencejava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    public static final String TAG = "RV";
    ArrayList<Course> courses = Course.generateNRandomCourses(100);
    RecyclerView rvCourses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        rvCourses = findViewById(R.id.rvCourses);
        CourseRecyclerAdapter courseRecyclerAdapter = new CourseRecyclerAdapter(
                courses
        );
        rvCourses.setLayoutManager(new LinearLayoutManager(this));
        rvCourses.setAdapter(courseRecyclerAdapter);
    }
}