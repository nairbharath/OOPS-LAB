import java.util.*;
class Rectangle{
	double length;
	double width;
	double area;
	String color;
	Scanner get = new Scanner(System.in);
	Rectangle(int i){
		System.out.print("\n\t Enter the colour of the rectangle "+i+" : ");
		color = get.nextLine();
		System.out.print("\n\t Enter the length of the rectangle "+i+" : ");
		length = get.nextDouble();
		System.out.print("\n\t Enter the width of the rectangle "+i+" : ");
		width = get.nextDouble();
	}
	void area(){
		area=length*width;
		System.out.println("\n\t Area of Rectangle : "+area);
	}
}
class rect{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(1);
		r1.area();
		Rectangle r2 = new Rectangle(2);
		r2.area();
		if ((r1.area==r2.area)&&(r1.color.equals(r1.color))){
			System.out.println("\n\t Matching Rectangles");
		}
		else{
			System.out.println("\n\t Non Matching Rectangles");
		}
	}
}
