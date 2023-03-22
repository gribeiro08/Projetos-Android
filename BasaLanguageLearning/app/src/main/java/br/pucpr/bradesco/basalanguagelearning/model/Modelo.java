package br.pucpr.bradesco.basalanguagelearning.model;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class Modelo {

    public Modelo(Drawable image_mod, String text_mod) {
        this.image_mod = image_mod;
        this.text_mod = text_mod;
    }

    public Drawable getImage_mod() {
        return image_mod;
    }

    public void setImage_mod(Drawable image_mod) {
        this.image_mod = image_mod;
    }

    public String getText_mod() {
        return text_mod;
    }

    public void setText_mod(String text_mod) {
        this.text_mod = text_mod;
    }

    private Drawable image_mod;
    private String text_mod;

}
