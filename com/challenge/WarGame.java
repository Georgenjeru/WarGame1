package com.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WarGame {
    private static Soldier[] createSoldiers() {
        Soldier[] soldiers = new Soldier[1000];
        for (int k = 0; k < 1000; k ++) {
            Soldier soldier = new Soldier("MIL_ID_000747");
            soldiers[k] = soldier;
        }
        return soldiers;
    }
    public static void main(String[] args) {
        Army army = new Army();
        army.setSoldiers(createSoldiers());
        Soldier soldier = new Soldier("MIL_ID_000750");
        Soldier soldierA = new Soldier("12345");
        soldier.changeTankNumber();
        soldier.shoot();
        int i = 0;
        while (i <= 1000) {
            soldier.shoot();
            soldierA.changeTankNumber();
            if (new Random().nextInt() % 2 == 0)
                soldier.changeShootingMode();
            i += 1000;
        }
    }
}
