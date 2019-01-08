package com.ck.domain;
// ÷¡ÒµØ¿‡
public class Grenade implements Weapon{
	 private String type;
	 private String name;

	    public Grenade(String type, String name) {
	        this.type = type;
	        this.name = name;
	    }

	    public Grenade() {
	    }

	    public String getType() {
	        return this.type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return this.type + this.name;
	    }

	    public String toString() {
	        return this.type + "(" + this.name + ")";
	    }

}
