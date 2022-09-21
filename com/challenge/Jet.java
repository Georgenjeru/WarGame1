package com.challenge;

public class Jet {
    private String jetNumber;
    private String model; // T-72
    private int bullet;

    public Jet(String tankNumber, String model, int bullet) {
        this.jetNumber = jetNumber;
        this.model = model;
        this.bullet = bullet;
    }

    public Jet(String tankNumber) {
    }

    public String getjetNumber() {
        return jetNumber;
    }

    public void setjetNumber(String jetNumber) {
        this.jetNumber = jetNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public void shoot() {

    }
}
