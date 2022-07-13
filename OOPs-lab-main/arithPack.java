import Arithmatic.*;
import java.util.*;
class arithPack implements Arithmatic.multiply,Arithmatic.division{
	public void product(int a,int b){
		System.out.println("\n\t Product : \t"+(a*b));
	}
	public void divide(int a,int b){
		System.out.println("\n\t Quotient : \t"+(a/b));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arithPack ar = new arithPack();
		addition x = new addition();
		subtract y = new subtract();
		System.out.print("\n\t Enter 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("\n\t Arithmatic Operations : ");
		System.out.println(" ------------------------------------------");
		int sum = x.add(a,b);
		int minus = y.sub(a,b);
		System.out.println("\n\t Sum : \t\t"+(a+b));
		System.out.println("\n\t Difference : \t"+(a-b));
		ar.product(a,b);
		ar.divide(a,b);
	}
}