package com.nokhrin.fitnesscounter;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FullscreenActivity extends AppCompatActivity {
    Button button1;
    private static int clickCounter=0;
    private RecyclerView exerciseList;
    private ExerciseListAdapter exerciseListAdapter;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        button1=findViewById(R.id.button1);
        exerciseList=findViewById(R.id.tv_exercise_1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        exerciseList.setLayoutManager(layoutManager);
        exerciseList.setHasFixedSize(true);
        exerciseListAdapter=new ExerciseListAdapter(10);
        exerciseList.setAdapter(exerciseListAdapter);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.button1){
                    clickCounter++;
                    button1.setText(String.valueOf(clickCounter));
                }
            }
        });

        /*View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.button1){
                    System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddddddd");
                    button1.setText("2");
                    textView.setText("22222222222");

                }
            }

            };*/
        }

}