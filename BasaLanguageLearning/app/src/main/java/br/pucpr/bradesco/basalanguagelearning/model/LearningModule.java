package br.pucpr.bradesco.basalanguagelearning.model;

import java.util.ArrayList;
import java.util.List;

public class LearningModule {

    private List<LearningObject> objects = new ArrayList<>();
    private LearningActivity activity;

    public LearningModule(List<LearningObject> objects, LearningActivity activity) {
        this.objects = objects;
        this.activity = activity;
    }

    public List<LearningObject> getObjects() {
        return objects;
    }

    public LearningActivity getActivity() {
        return activity;
    }
}
