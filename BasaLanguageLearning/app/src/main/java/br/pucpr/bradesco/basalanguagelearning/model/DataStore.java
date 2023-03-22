package br.pucpr.bradesco.basalanguagelearning.model;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.pucpr.bradesco.basalanguagelearning.R;

public class DataStore {

    private static DataStore instance = new DataStore();
    private List<LearningModule> modules = new ArrayList<>();
    public int actualModel = 0;
    private Context context;

    public List<Modelo> getModelos() {
        return modelos;
    }

    private List<Modelo> modelos = new ArrayList<>();

    public int getActualModel() {
        return actualModel;
    }

    public void setActualModel(int actualModel) {
        this.actualModel = actualModel;
    }

    public void setContext(Context context) {
        this.context = context;
    }
    public void addModelo() {

        modelos.add(new Modelo(context.getResources().getDrawable(R.drawable.img_animalss), "Módulo 1"));
        modelos.add(new Modelo(context.getResources().getDrawable(R.drawable.img_animalss), "Módulo 2"));
        modelos.add(new Modelo(context.getResources().getDrawable(R.drawable.img_animalss), "Módulo 3"));
        modelos.add(new Modelo(context.getResources().getDrawable(R.drawable.img_fruits), "Módulo 4"));
        modelos.add(new Modelo(context.getResources().getDrawable(R.drawable.img_fruits), "Módulo 5"));

    }

    private DataStore() {

    //Modulos sobre animais

        List<LearningObject> objects = new ArrayList<>();
        objects.add(new LearningObject(R.drawable.img_rabit, "Rabbit"));
        objects.add(new LearningObject(R.drawable.img_dog, "Dog"));
        objects.add(new LearningObject(R.drawable.img_cat, "Cat"));
        LearningActivity activity = new LearningActivity(
                R.drawable.img_dog,
                "Rabbit",
                "Cat",
                "Dog",
                2);

        LearningModule module1 = new LearningModule(objects, activity);
        modules.add(module1);


        List<LearningObject> objects2 = new ArrayList<>();
        objects2.add(new LearningObject(R.drawable.img_lion, "Lion"));
        objects2.add(new LearningObject(R.drawable.img_horse, "Horse"));
        objects2.add(new LearningObject(R.drawable.img_monkey, "Monkey"));
        LearningActivity activity2 = new LearningActivity(
                R.drawable.img_lion,
                "Horse",
                "Lion",
                "Monkey",
                1);

        LearningModule module2 = new LearningModule(objects2, activity2);
        modules.add(module2);


        List<LearningObject> objects3 = new ArrayList<>();
        objects3.add(new LearningObject(R.drawable.img_snake, "Snake"));
        objects3.add(new LearningObject(R.drawable.img_butterfly, "Butterfly"));
        objects3.add(new LearningObject(R.drawable.img_bird, "Bird"));
        LearningActivity activity3 = new LearningActivity(
                R.drawable.img_snake,
                "Butterfly",
                "Bird",
                "Snake",
                2);

        LearningModule module3 = new LearningModule(objects3, activity3);
        modules.add(module3);

    // Modulos sobre comidas

        List<LearningObject> objects4 = new ArrayList<>();
        objects4.add(new LearningObject(R.drawable.img_banana, "Banana"));
        objects4.add(new LearningObject(R.drawable.img_pineaple, "Pineaple"));
        objects4.add(new LearningObject(R.drawable.img_strawberry, "Strawbery"));
        LearningActivity activity4 = new LearningActivity(
                R.drawable.img_pineaple,
                "Pineaple",
                "Banana",
                "Strawberry",
                0);

        LearningModule module4 = new LearningModule(objects4, activity4);
        modules.add(module4);


        List<LearningObject> objects5 = new ArrayList<>();
        objects5.add(new LearningObject(R.drawable.img_apple, "Apple"));
        objects5.add(new LearningObject(R.drawable.img_watermellon, "Watermellon"));
        objects5.add(new LearningObject(R.drawable.img_orange, "Orange"));
        LearningActivity activity5 = new LearningActivity(
                R.drawable.img_watermellon,
                "Watermellon",
                "Apple",
                "Orange",
                0);

        LearningModule module5 = new LearningModule(objects5, activity5);
        modules.add(module5);

    }



    public static DataStore sharedInstance() {
        return instance;
    }

    public List<LearningModule> getModules() {
        return modules;
    }


}
