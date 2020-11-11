package com.exaccessmodifier;

public class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("blue");
        System.out.println(circle.getRadius());
        System.out.println(circle.toString() + ", Area: "+ circle.getArea());
    }
}
