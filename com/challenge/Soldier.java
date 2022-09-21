
package com.challenge;
import java.util.List;

public class Soldier {
    private Gun gun;
    private String militaryId;
    private char type;
    private Tank tank;// A or E

    private Jet jet;
    private String tankNumber;
    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.gun = new Gun();
        this.tank = new Tank("1200");
        this.jet = new Jet("12345");
    }
    public void shoot() {
        System.out.println(this.militaryId + " shooting");
        this.gun.shootBullets();
    }
    public void changeShootingMode() {
        this.gun.changeShootingMode();
    }


    public void changeTankNumber(){
        System.out.println(this.tankNumber + "12345");
            this.tank.changeTankNumber();
        }
    }


