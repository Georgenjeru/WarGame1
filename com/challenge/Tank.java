package com.challenge;

public class Tank {
    private String tankNumber;
    private String model; // T-72
    int shells;

    public Tank(String tankNumber) {
    }

    public void shell(){
       if(shells>0){
           if(this.model.equals("Scarerc")){
               shells --;
               System.out.println("----");
           }
           else {
               shells -=5;
               System.out.println("----");
           }
       }
   }

    public Tank(String tankNumber, String model, int shells) {
        this.tankNumber = tankNumber;
        this.model = model;
        this.shells = shells;
    }

    public String getTankNumber() {
        return tankNumber;
    }

    public void setTankNumber(String tankNumber) {
        this.tankNumber = tankNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getShells() {
        return shells;
    }

    public void setShells(int shells) {
        this.shells = shells;
    }

    public void shoot() {

    }

    public void changeTankNumber() {
    }

}
