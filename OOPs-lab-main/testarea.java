import Graphics.*;
import java.util.*;
class testarea implements Graphics.square,Graphics.triangle{
	public void square_area(int a){
		System.out.println("\n\t Area of square : "+(a*a));
	}
	public void tr_area(int b,int h){
		System.out.println("\n\t Area of Triangle : "+(.5*b*h));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rectangle r = new rectangle();
		circle c = new circle();
		testarea t = new testarea();
		int x;
		do{
			System.out.println("\n\t\t MENU ");
			System.out.println(" ======================================");
			System.out.println("\n\t 1. Rectangle \n\t 2. Circle \n\t 3. Square \n\t 4. Triangle \n\t 5. Exit ");
			System.out.print("\n\t Select a shape : ");
			x = sc.nextInt();
			if (x == 1){
				System.out.print("\n\t Enter length : ");
				int l = sc.nextInt();
				System.out.print("\t Enter breadth : ");
				int b = sc.nextInt();
				System.out.println("\n\t Area = "+r.rect(l,b));
			}
			else if(x==2){
				System.out.print("\n\t Enter radius : ");
				int radius = sc.nextInt(); 
				double res = c.circle_area(radius);
				System.out.println("\n\t Area = "+res);
			}
			else if(x==3){
				System.out.print("\n\t Enter side : ");
				int side = sc.nextInt();
				t.square_area(side);
			}
			else if(x==4){
				System.out.print("\n\t Enter base : ");
				int base = sc.nextInt();
				System.out.print("\n\t Enter height : ");
				int height = sc.nextInt();
				t.tr_area(base,height);
			}
			else if(x==5){
				System.out.println("\n\t Program is exiting ......");
			}
			else{
				System.out.println("\n\t Wrong option \n\t Try again ");
			}
			System.out.println("_______________________________________________________");
		}
		while (x!=5);
	}
}