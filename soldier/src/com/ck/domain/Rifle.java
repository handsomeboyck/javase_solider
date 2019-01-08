package com.ck.domain;
//步枪
public class Rifle implements Weapon{
    private String model;
    private double size;//步枪子弹尺寸 eg:5.56mm
    public Rifle(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public Rifle() {
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDescription() {
        return this.model + this.size;
    }

    public String toString() {
        return this.model + "(" + this.size + "毫米)";
    }
}
