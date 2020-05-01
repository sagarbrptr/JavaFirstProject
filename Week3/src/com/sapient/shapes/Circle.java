package com.sapient.shapes;

public class Circle
{
    private int radius;
    Circle(int radius)
    {
        this.radius=radius;
    }
    public double calculateArea()
    {
        double area=3.14*radius*radius;
        System.out.println("The Area of Circle is "+ area);
        return area;
    }
}