package com.nokhrin.fitnesscounter;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class FullscreenActivity extends AppCompatActivity {
    Button button1, buttonExercise;
    private static int clickCounter=0;
    private RecyclerView exerciseList;
    private ExerciseListAdapter exerciseListAdapter;
    ArrayList<State> states = new ArrayList<State>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        button1=findViewById(R.id.button1);
        buttonExercise=findViewById(R.id.buttonExercise);

        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter++;
                button1.setText(String.valueOf(clickCounter));
            }
        });

        buttonExercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullscreenActivity.this, TableExerciseAcrivity.class);
                startActivity(intent);
            }
        });
    }

    private void setInitialData(){
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.brazilia));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.brazilia));
        states.add(new State ("Колумбия", "Богота", R.drawable.brazilia));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
        states.add(new State ("Чили", "Сантьяго", R.drawable.brazilia));
    }




}