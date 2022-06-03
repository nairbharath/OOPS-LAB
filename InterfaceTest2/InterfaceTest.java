import java.util.*;
import java.io.*;
import java.lang.*;

interface Shape
{
	final float pi=3.14f;
	void area();
	void peri();	
}

class Circle implements Shape
{
	Scanner sc= new Scanner(System.in);
	float r;
	
	public void area()
	{
		System.out.println("Enter the radius of circle: ");
		r=sc.nextFloat();
		float a =pi*r*r;
		System.out.println("Area of circle is : "+a);
	}
	public void peri()
	{
		System.out.println("Enter the radius of circle: ");
		r=sc.nextFloat();
		float a =2*pi*r;
		System.out.println("Perimeter of circle is : "+a);
	}
}

class Rect implements Shape
{
	Scanner sc= new Scanner(System.in);
	float l,b;
	
	
	
	public void area()
	{
		System.out.println("Enter the length and breadth of Rect: ");
		l=sc.nextFloat();
		b=sc.nextFloat();
		float a =l*b;
		System.out.println("Area of Rect is : "+a);
	}
	public void peri()
	{
		System.out.println("Enter the length and breadth of Rect: ");
		l=sc.nextFloat();
		b=sc.nextFloat();
		float a =2*(l+b);
		System.out.println("Perimeter of Rect is : "+a);
	}
}
class InterfaceTest{
public static void  main(String args[]){
	Circle c = new Circle();
	Rect r = new Rect();
	Scanner s = new Scanner(System.in);
	int ch,ch1;
	int i=1;
	while(true){
		System.out.println("------MENU------");
		System.out.println("1.Rectangle\n");
		System.out.println("2.Circle\n");	
		System.out.println("3.Exit\n");
		System.out.println("Enter Your Choice\n");
		ch = s.nextInt();
		switch(ch){
			case 1:System.out.println("1.Area");
				System.out.println("2.Perimeter");
				System.out.println("Enter Your Choice");
				ch1 = Integer.parseInt(s.nextLine());
                                if(ch1==1){
					r.area();
				}
				else if(ch1==2){
					r.peri();				
				}
				else{
					System.out.println("Enter Your Choice");
				}
				break;
			case 2:System.out.println("1.Area");
				System.out.println("2.Perimeter");
				System.out.println("Enter Your Choice");
				ch1 = s.nextInt();
                                if(ch1==1){
					c.area();
				}
				else if(ch1==2){
					c.peri();				
				}
				else{
					return;
				}
				break;
			case 3:
				System.out.println("Exiting!!!");
				System.exit(0);
			default :
				System.out.println("Enter Valid Choice");
			}
	}
}
}
