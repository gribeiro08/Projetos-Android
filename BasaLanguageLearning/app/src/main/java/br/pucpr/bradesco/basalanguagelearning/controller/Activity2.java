package br.pucpr.bradesco.basalanguagelearning.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.pucpr.bradesco.basalanguagelearning.R;
import br.pucpr.bradesco.basalanguagelearning.model.DataStore;
import br.pucpr.bradesco.basalanguagelearning.model.LearningModule;
import br.pucpr.bradesco.basalanguagelearning.model.LearningObject;

public class Activity2 extends AppCompatActivity {

    //objetos de visao
    private ImageView imageView;
    private Button button_next;
    private Button button_back;
    private TextView text_name;

    //variaveis em escopo de classe
    private LearningModule module;
    private LearningObject object;
    private int current_module = DataStore.sharedInstance().getActualModel();
    private int current_object = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        imageView = findViewById(R.id.imgView);
        button_next = findViewById(R.id.button_next);
        button_back = findViewById(R.id.button_back);
        text_name = findViewById(R.id.text_name);

        module = DataStore.sharedInstance().getModules().get(current_module);
        fillUI();

        button_next.setOnClickListener(view -> {

            current_object++;
            fillUI();

        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();


    }

    public void openActivity3 () {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
        finish();
    }

    private void fillUI() {

        object = module.getObjects().get(current_object);

        imageView.setImageResource(object.getImage());
        text_name.setText(object.getName());

        if (current_object == 2) {
            button_next.setVisibility(View.INVISIBLE);
            button_back.setVisibility(View.VISIBLE);
            button_back.setEnabled(true);
        }
    }
}
