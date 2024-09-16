package model;

import java.awt.*;

public class Cylinder extends Circle {
    private Double Heigth;

    public Double CalculateVolume() {
        return (2* Math.PI *  super.getRadius() * Heigth * 2 * Math.PI * super.getRadius() * super.getRadius());
    }
    public void mostrar(){
        System.out.println("El radio es " + super.getRadius() + " y es " +super.getColor()+ " la suma del area es " + super.CalculateArea());
        System.out.println("La altura es: " + Heigth + " El volumen es "+CalculateVolume());
    }

    public Cylinder(Double radius, String color, Double heigth) {
        super(radius, color);
        Heigth = heigth;
    }
    public Cylinder(){
        super(1.0,"rojo");
        this.Heigth = 1.0;
    }
}
