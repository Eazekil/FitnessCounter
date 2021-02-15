package com.nokhrin.fitnesscounter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ExerciseViewHolder>{
    private int numberExercise;
    private static int viewHolderCount;
    public ExerciseListAdapter(int numberOfExercise){
        numberExercise=numberOfExercise;
        viewHolderCount=0;
    }
    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        int layoutIdListItem=R.layout.list_of_exercise;

        LayoutInflater inflater=LayoutInflater.from(context);

        View view=inflater.inflate(layoutIdListItem,parent,false);

        ExerciseViewHolder viewHolder=new ExerciseViewHolder(view);
        viewHolder.viewHolderIndex.setText("Number of exercise: "+viewHolderCount);
        viewHolderCount++;

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        holder.bind(position);

    }

    @Override
    public int getItemCount() {
        return numberExercise;
    }

    class ExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView listItemExerciseView;
        TextView viewHolderIndex;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            listItemExerciseView=itemView.findViewById(R.id.tv_exercise_1);
            viewHolderIndex=itemView.findViewById(R.id.tv_view_holder);
        }
        void bind(int listIndex){
            listItemExerciseView.setText(String.valueOf(listIndex));
        }
    }
}
