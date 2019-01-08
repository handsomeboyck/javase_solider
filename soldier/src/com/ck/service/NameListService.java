package com.ck.service;
import com.ck.domain.*;

public class NameListService {
    private Soldier[] soldiers;

    public NameListService() {
        this.soldiers = new Soldier[Data.SOLDIERS.length];

        for(int i = 0; i < this.soldiers.length; ++i) {
            Soldier soldier = null;
            int type = Integer.parseInt(Data.SOLDIERS[i][0]);
            int id = Integer.parseInt(Data.SOLDIERS[i][1]);
            String name = Data.SOLDIERS[i][2];
            int age = Integer.parseInt(Data.SOLDIERS[i][3]);
            double fighting = Double.parseDouble(Data.SOLDIERS[i][4]);
            Weapon weapon = null;
            switch(type) {
            case 11:
                weapon = this.createWeapon(i);
                soldier = new Infantry(id, name, age, fighting, weapon);
                break;
            case 12:
                weapon = this.createWeapon(i);
                soldier = new SpecialTroops(id, name, age, fighting, weapon, Double.parseDouble(Data.SOLDIERS[i][5]));
                break;
            case 13:
                weapon = this.createWeapon(i);
                soldier = new Commander(id, name, age, fighting, weapon, Double.parseDouble(Data.SOLDIERS[i][5]), Integer.parseInt(Data.SOLDIERS[i][6]));
                break;
            default:
                soldier = new Soldier(id, name, age, fighting);
            }

            this.soldiers[i] = (Soldier)soldier;
        }

    }

    public Weapon createWeapon(int i) {
        Weapon weapon = null;
        int type = Integer.parseInt(Data.WEAPONS[i][0]);
        switch(type) {
        case 21:
            weapon = new Pistol(Data.WEAPONS[i][1], Double.parseDouble(Data.WEAPONS[i][2]));
            break;
        case 22:
            weapon = new Rifle(Data.WEAPONS[i][1], Double.parseDouble(Data.WEAPONS[i][2]));
            break;
        case 23:
            weapon = new Grenade(Data.WEAPONS[i][1], Data.WEAPONS[i][2]);
        }

        return (Weapon)weapon;
    }

    public Soldier[] getAllSoldiers() {
        return this.soldiers;
    }

    public Soldier getSoldier(int id) throws TeamException {
        for(int i = 0; i < this.soldiers.length; ++i) {
            if (this.soldiers[i].getId() == id) {
                return this.soldiers[i];
            }
        }

        throw new TeamException("没有找到指定的士兵！");
    }

    public static void main(String[] args) {
        NameListService nls = new NameListService();
        Soldier[] soldier = nls.soldiers;

        for(int i = 0; i < soldier.length; ++i) {
            System.out.println(soldier[i]);
        }

    }

}
