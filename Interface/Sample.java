// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

interface Shape {
	double area();
	double perimeter();
}

class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {

		return length * breadth;
	}

	@Override
	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}

public class Sample {

	public static void main(String[] args) {
	    /*
		// Rectangle area and parameter
		double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());
        */
        
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        double l,b;
        double r;
        do
        {
            System.out.println("Select an option: \n1.Area of Circle\n2.Perimeter of Circle\n3.Area of Rect\n4.Perimeter of Rect\nEnter here: ");
            int choice=sc.nextLine();
            
            switch(choice)
            
            {
                case 1:
                    System.out.println("Area is: ",c.area);
                
                case 2:
                     System.out.println("Perimeter is: ",c.perimeter);
                     
                case 3:
                      System.out.println("Enter length: ");
                      l=sc.nextLine();
                      System.out.println("Enter breadth: ");
                      b=sc.nextLine();
                      r=new Reactangle(l,b);
                     System.out.println("Area is: ",r.area);
                
                case 4:
                     System.out.println("Perimeter is: ",r.perimeter);
                case 5:
                     System.out.println("Exiting");
                     System.exit(0);
                default:
                     System.out.println("Invalid option");
            }
        }while(choice<6);
        
        
        
	}
}

