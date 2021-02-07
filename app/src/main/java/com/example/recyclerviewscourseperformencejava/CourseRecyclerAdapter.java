package com.example.recyclerviewscourseperformencejava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseRecyclerAdapter extends RecyclerView.Adapter<CourseRecyclerAdapter.CouseViewHolder> {

    ArrayList<Course> courses;

    public CourseRecyclerAdapter(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @NonNull
    @Override
    public CouseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = li.inflate(R.layout.list_item_course_card,parent,false);
        return new CouseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CouseViewHolder holder, int position) {
        Course course = courses.get(position);
        holder.tvCourseName.setText(course.getName());
        holder.tvTeacherName.setText(course.getTeacherName());
        holder.tvLectures.setText(String.valueOf(course.getLectures()));
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    class CouseViewHolder extends RecyclerView.ViewHolder{
        TextView tvCourseName,tvTeacherName,tvLectures;
        public CouseViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCourseName = itemView.findViewById(R.id.tvCourseName);
            tvTeacherName = itemView.findViewById(R.id.tvTeacherName);
            tvLectures = itemView.findViewById(R.id.tvLectures);
        }
    }
}
