import java.util.*;
class Employer{
	Scanner obj = new Scanner(System.in);
	int id,salary;
	String name;
	void read(){
		System.out.print("\n\t Enter name : ");
		name=obj.nextLine();
		System.out.print("\t Enter Employee id : ");
		id=obj.nextInt();
		System.out.print("\t Enter monthly salary : ");
		salary=obj.nextInt();
	}
	void display(){
		System.out.println("\n\t Id : "+id);
		System.out.println("\t Name : "+name);
		System.out.println("\t Salary ( Annual ) : "+salary*12);
	}
}
public class employee{
	public static void main(String[] args) {
		Employer e1 = new Employer();
		Employer e2 = new Employer();
		System.out.println("\n\t Enter first employer details : ");
		e1.read();
		System.out.println("\n\t Enter Second employer details : ");
		e2.read();
		System.out.println("\n\t\t\t Employee 1");
		e1.display();
		System.out.println("\n\t\t\t Employee 2");
		e2.display();
	}
}