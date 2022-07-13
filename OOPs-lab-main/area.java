import java.util.*;
class shape{
	public void areaOvr(int l,int b){
		System.out.println("\n\t Area of rectangle : "+(l*b));
	}
	public void areaOvr(double r){
		double pi = 3.14;
		System.out.println("\n\t Area of Circle : "+(pi*(r*r)));
	}
	public void areaOvr(int a){
		System.out.println("\n\t Area of Square : "+(a*a));
	}
}
public class area{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		shape s = new shape();
		System.out.print("\n\t Enter the length and breadth of rectangle : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		s.areaOvr(l,b);
		System.out.print("\n\t Enter the side of the square : ");
		int a = sc.nextInt();
		s.areaOvr(a);
		System.out.print("\n\t Enter the radius of the circle : ");
		double r = sc.nextDouble();
		s.areaOvr(r);
	}
}