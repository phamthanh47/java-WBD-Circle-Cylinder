package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle=new Circle(8,"blue");
	Cylinder cylinder=new Cylinder(10,"yellow",9);
	String output= circle.toString()+"  Area:" + circle.getArea()+"\n\n"+
            cylinder.toString()+"  Area:"+cylinder.getArea()+
            "  volume: "+cylinder.getVolume();
        System.out.println(output);
        System.exit(0);
    }
}
