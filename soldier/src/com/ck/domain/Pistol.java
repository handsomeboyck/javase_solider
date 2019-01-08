package com.ck.domain;
//手枪类
public class Pistol implements Weapon{
	String model;//武器型号
	double force;//武器威力
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getForce() {
		return force;
	}
	public void setForce(double force) {
		this.force = force;
	}
	public Pistol(String model, double force) {
		
		this.model = model;
		this.force = force;
	}
	public Pistol() {
	
	}
    public String getDescription() {
        return this.model + this.force;
    }

    public String toString() {
        return this.model + "(" + this.force + ")";
    }
	

}
