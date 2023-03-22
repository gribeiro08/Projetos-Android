package br.pucpr.bradesco.basalanguagelearning.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import br.pucpr.bradesco.basalanguagelearning.R;
import br.pucpr.bradesco.basalanguagelearning.model.DataStore;
import br.pucpr.bradesco.basalanguagelearning.model.LearningActivity;
import br.pucpr.bradesco.basalanguagelearning.model.LearningModule;
import br.pucpr.bradesco.basalanguagelearning.model.LearningObject;

public class Activity3 extends AppCompatActivity {

    // objetos de visao
    private ImageView img_challenge;
    private Button btn_asw_1;
    private Button btn_asw_2;
    private Button btn_asw_3;
    private TextView txt_asw;

    private int current_module = DataStore.sharedInstance().getActualModel();
    private LearningModule module;
    private LearningActivity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btn_asw_1 = findViewById(R.id.btn_asw_1);
        btn_asw_2 = findViewById(R.id.btn_asw_2);
        btn_asw_3 = findViewById(R.id.btn_asw_3);
        txt_asw = findViewById(R.id.txt_asw);
        img_challenge = findViewById(R.id.img_challenge);

        module = DataStore.sharedInstance().getModules().get(current_module);
        fillUI();

        btn_asw_1.setOnClickListener(view -> {
            asw(0);

        });

        btn_asw_2.setOnClickListener(view -> {
            asw(1);
        });

        btn_asw_3.setOnClickListener(view -> {
            asw(2);

        });

    }

    public void openMainActivity () {
        finish();
    }

    private void fillUI() {

        activity = module.getActivity();
        img_challenge.setImageResource(activity.getImage());
        btn_asw_1.setText(activity.getOpt1());
        btn_asw_2.setText(activity.getOpt2());
        btn_asw_3.setText(activity.getOpt3());

    }

    private void asw(int numButton) {
         if (numButton == activity.getResult()) {
             txt_asw.setText(" Correto");

             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     openMainActivity();
                 }
             }, 4000);
         }

         else {

             txt_asw.setText("Tente novamente");

             new Handler().postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     txt_asw.setText("");
                 }
             }, 4000);
         }



    }
}