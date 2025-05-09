/*Create a functional interface Shape with a method double area() and a default method
void printArea(). Implement the interface using lambda expressions for different
shapes. Define the Shape functional interface with an area method. Implement the
interface for shapes like circle, square, and rectangle using lambda expressions. Use the
default method to print the area of each shape.*/

package Assignment_7;

import java.util.Scanner;
@FunctionalInterface
interface Shape
{
    double area();
    default void printArea(){
        System.out.println("Area: "+area());
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape circle = ()->{
            System.out.print("Enter the radius: ");
            double r = sc.nextDouble();
            return r*r;
        };
        Shape square = ()->{
            System.out.print("Enter the side: ");
            double s = sc.nextDouble();
            return s*s;
        };
        Shape rectangle = ()->{
            System.out.print("Enter the length: ");
            double l = sc.nextDouble();
            System.out.print("Enter the breadth: ");
            double b = sc.nextDouble();
            return l*b;
        };
        System.out.println("Circle: ");
        circle.printArea();
        System.out.println("\nSquare: ");
        square.printArea();
        System.out.println("\nRectangle: ");
        rectangle.printArea();
    }
}

/*OUTPUT
Circle: 
Enter the radius: 5
Area: 25.0

Square: 
Enter the side: 4
Area: 16.0

Rectangle: 
Enter the length: 4
Enter the breadth: 3
Area: 12.0
*/
