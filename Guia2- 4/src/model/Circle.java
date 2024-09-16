package model;

public class Circle {
    private Double radius;
    private String color;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double CalculateArea() {
        return (Math.PI * radius * radius);
    }

    public void mostrar() {
        System.out.println("El radio es " + radius + " y es " + color + " la suma del area es " + CalculateArea());
    }



    public Circle(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle() {

    }


}
