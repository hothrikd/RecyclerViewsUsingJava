package com.example.recyclerviewscourseperformencejava;

import java.util.ArrayList;
import java.util.Random;

public class Course {
    String name;
    String teacherName;
    int lectures;

    public Course(String name, String teacherName, int lectures) {
        this.name = name;
        this.teacherName = teacherName;
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getLectures() {
        return lectures;
    }
    public static String[] teachers={
            "a","b","c","d","e","f"
    };
    public static String[] courseNames = {
            "1","2","3","4","5","6"
    };
    public static ArrayList<Course> generateNRandomCourses(int n)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            Course course = new Course(
                    teachers[r.nextInt(6)],
                    courseNames[r.nextInt(6)],
                    10+r.nextInt(10)
            );
            courses.add(course);
        }
        return courses;
    }
}
