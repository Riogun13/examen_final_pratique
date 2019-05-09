package com.example.a533.exercice_de_rvision_examen_final;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question_1 extends AppCompatActivity{
    final Context context = this;
    List<JobOfferModel> jobOfferList = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1);

        recyclerView = findViewById(R.id.recyclerView_todo);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new JobOfferModelRecyclerAdapter(jobOfferList);
        recyclerView.setAdapter(adapter);

        JobOfferModel jobOfferAdd = new JobOfferModel("Bitch","test", 5.50f);
        jobOfferList.add(jobOfferAdd);
        JobOfferModel jobOfferAdd2 = new JobOfferModel("Bitch2","test2", 6.50f);
        jobOfferList.add(jobOfferAdd2);
        JobOfferModel jobOfferAdd3 = new JobOfferModel("Bitch3","test3", 7.50f);
        jobOfferList.add(jobOfferAdd3);
    }



}


