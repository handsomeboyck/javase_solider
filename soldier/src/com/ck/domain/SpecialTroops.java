package com.ck.domain;
//特种兵
public class SpecialTroops extends Infantry{
	private double field;//野外生存能力

    public SpecialTroops() {
    }

    public SpecialTroops(int id, String name, int age, double fighting, Weapon weapon, double field) {
        super(id, name, age, fighting, weapon);
        this.field = field;
    }

    public double getField() {
        return this.field;
    }

    public void setField(double field) {
        this.field = field;
    }

    public String getDetailsForTeam() {
        return this.getMemberId() + "/" + this.getDetails() + "\t" + "特种兵" + "\t" + this.getField();
    }

    public String toString() {
        return this.getDetails() + "\t特种兵\t" + this.getStatus() + "\t" + this.getField() + "\t\t" + this.getWeapon();
    }

}
