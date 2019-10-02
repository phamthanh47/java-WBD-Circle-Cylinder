package com.company;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
    }
    public Cylinder(double radius, String color,double height)
    {
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String toString(){
        return super.toString() +"  height= "+height;
    }
    public double getArea(){
        return super.getArea()*2+super.getArea()*height;
    }
    public double getVolume()
    {
        return super.getArea()*height;
    }
}
