import java.util.*;
public class complex{
	int real;
	int imag;
	Scanner obj = new Scanner(System.in);
	void read(){
		System.out.print("\n\t Enter the real part : ");
		real = obj.nextInt();
		System.out.print("\t Enter the imaginery part : ");
		imag = obj.nextInt();
	}
	void display(){
		System.out.print("\n\t "+real+"\t+\t"+imag+"i");
	}
	public static void main(String[] args){
		complex num1 = new complex();
		complex num2 = new complex();
		complex num3 = new complex();
		System.out.println("\n\t Enter the first number :");
		num1.read();
		System.out.println("\n\t Enter the second number :");
		num2.read();
		num3.real = num1.real + num2.real;
		num3.imag = num1.imag + num2.imag;
		num1.display();
		num2.display();
		System.out.println("\n\t--------------------------");
		num3.display();
	}
}