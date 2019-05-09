package com.example.a533.exercice_de_rvision_examen_final;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.List;

public class JobOfferModelRecyclerAdapter extends RecyclerView.Adapter<JobOfferModelRecyclerAdapter.MyViewHolder> {
    List<JobOfferModel> jobOfferList;

    public JobOfferModelRecyclerAdapter(List<JobOfferModel> jobOfferList){
        this.jobOfferList = jobOfferList;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView titrePoste;
        TextView description;
        TextView salaire;
        Button delete;
        public MyViewHolder(View itemView) {
            super(itemView);
            titrePoste = itemView.findViewById(R.id.textView_titre);
            description = itemView.findViewById(R.id.textView_description);
            salaire = itemView.findViewById(R.id.textView_salaire);
            delete = itemView.findViewById(R.id.btn_retirer);
        }
    }

    @NonNull
    @Override
    public JobOfferModelRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_card, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull JobOfferModelRecyclerAdapter.MyViewHolder holder, int position) {
        JobOfferModel todoToDisplay = jobOfferList.get(position);
        holder.titrePoste.setText(todoToDisplay.getTitrePoste());
        holder.description.setText(todoToDisplay.getDescription());
        holder.salaire.setText(todoToDisplay.getSalaire().toString());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteFromList(jobOfferList.get(position));
            }
        });

    }

    public void deleteFromList(int position){

    }

    @Override
    public int getItemCount() {
        return jobOfferList.size();
    }

}
