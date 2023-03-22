package br.pucpr.bradesco.basalanguagelearning.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.pucpr.bradesco.basalanguagelearning.R;
import br.pucpr.bradesco.basalanguagelearning.controller.Activity2;
import br.pucpr.bradesco.basalanguagelearning.model.DataStore;
import br.pucpr.bradesco.basalanguagelearning.view.ModeloAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ModeloAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataStore.sharedInstance().setContext(this);
        DataStore.sharedInstance().addModelo();

        recyclerView = findViewById(R.id.rcv_mod);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(llm);

        adapter = new ModeloAdapter(DataStore.sharedInstance().getModelos(), this);
        recyclerView.setAdapter(adapter);

    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}