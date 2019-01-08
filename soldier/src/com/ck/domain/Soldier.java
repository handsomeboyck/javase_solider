package com.ck.domain;
//Ê¿±øÀà
public class Soldier {
	 private int id;
	    private String name;
	    private int age;
	    private double fighting;
       
	    public Soldier(int id, String name, int age, double fighting) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.fighting = fighting;
	    }

	    public Soldier() {
	    }

	    public int getId() {
	        return this.id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return this.age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public double getFighting() {
	        return this.fighting;
	    }

	    public void setFighting(double fighting) {
	        this.fighting = fighting;
	    }

	    public String getDetails() {
	        return this.id + "\t" + this.name + "\t" + this.age + "\t" + this.fighting;
	    }

	    public String toString() {
	        return this.getDetails();
	    }
}
