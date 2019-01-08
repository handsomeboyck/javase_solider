package com.ck.domain;
//步兵类
public class Infantry extends Soldier{
    private int memberId;
    private Status status;
    private Weapon weapon;
   
    public Infantry() {
        this.status = Status.FREE;
    }

    public Infantry(int id, String name, int age, double fighting, Weapon weapon) {
        super(id, name, age, fighting);
        this.status = Status.FREE;
        this.weapon = weapon;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void setMemeberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDetailsForTeam() {
        return this.getMemberId() + "/" + this.getDetails() + "\t" + "步兵";
    }

    public String toString() {
        return this.getDetails() + "\t步兵\t" + this.status + "\t\t\t" + this.weapon;
    }
	
	

}
