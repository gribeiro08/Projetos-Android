package br.pucpr.bradesco.basalanguagelearning.model;

public class LearningActivity {

    private int image;
    private String opt1;
    private String opt2;
    private String opt3;
    private int result;

    public LearningActivity(int image, String opt1, String opt2, String opt3, int result) {
        this.image = image;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.result = result;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
