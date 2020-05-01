package com.sapient.shapes;

public class Square
{
    private int sides;
    Square(int sides)
    {
        this.sides=sides;
    }
    public double calculateArea()
    {
        double area=sides*sides;
        System.out.println("The Area of Square is "+ area);
        return area;
    }
}