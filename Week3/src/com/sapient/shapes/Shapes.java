package com.sapient.shapes;

/**
 * Hello world!
 *
 */
public class Shapes 
{
    private int numberOfSides;
    // Shapes(int numberOfSides)
    // {
    //     this.numberOfSides=numberOfSides;
    //     if(numberOfSides==1)
    //         System.out.println
    // }
    public double calculateArea(int numberOfSides,int sideLength)
    {
        if(numberOfSides == 1)
        {
            Circle circle = new Circle(sideLength);
            return circle.calculateArea();
        }
        else if(numberOfSides == 4)  
        {
            Square square = new Square(sideLength);
            return square.calculateArea(); 
        }
        else if(numberOfSides == 3)
        {
            Triangle triangle = new Triangle(sideLength);
            return triangle.calculateArea();
        } 
        else
        {
            System.out.println("No Shapes Present");  
            return 0.0;
        }
    }
    public static void main( String[] args )
    {
        Shapes shape = new Shapes();
        // //Circle
        // shape.calculateArea(1,2);
        
        // //Square
        // shape.calculateArea(4,3);

        // //Triangle 
        // shape.calculateArea(3,4);

        //Test 1
        shape.calculateArea(3,12);

        //Test 2
        shape.calculateArea(4,15);

        //Test 3
        shape.calculateArea(5,15);
        
    }
}
