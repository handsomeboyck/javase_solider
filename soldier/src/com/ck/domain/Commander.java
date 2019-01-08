package com.ck.domain;
//指挥官
public class Commander extends SpecialTroops {
    private int commanderRating;//指挥等级

    public Commander() {
    }

    public Commander(int id, String name, int age, double fighting, Weapon weapon, double field, int commanderRating) {
        super(id, name, age, fighting, weapon, field);
        this.commanderRating = commanderRating;
    }

    public int getCommanderRating() {
        return this.commanderRating;
    }

    public void setCommanderRating(int commanderRating) {
        this.commanderRating = commanderRating;
    }

    public String getDetailsForTeam() {
        return this.getMemberId() + "/" + this.getDetails() + "\t" + "指挥官" + "\t" + this.getField() + "\t\t" + this.getCommanderRating() + "级\t";
    }

    public String toString() {
        return this.getDetails() + "\t指挥官\t" + this.getStatus() + "\t" + this.getField() + "\t  " + this.commanderRating + "级\t" + this.getWeapon();
    }

}
