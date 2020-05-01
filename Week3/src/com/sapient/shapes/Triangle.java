package com.sapient.shapes;

public class Triangle
{
    private int sides;
    Triangle(int sides)
    {
        this.sides=sides;
    }
    public double calculateArea()
    {
        double area=0.433*sides*sides;
        System.out.println("The Area of Triangle is "+ area);
        return area;
    }
}