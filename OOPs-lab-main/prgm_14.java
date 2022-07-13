import java.util.*;
class Employee{
	int empid,salary;
	String name,address;
	Employee(int e,int s,String n,String a){
		empid = e;
		salary = s;
		name = n;
		address = a;
	}
	void disp(){
		System.out.println("\t Employee id : "+empid);
		System.out.println("\t Name        : "+name);
	}
}
class teachers extends Employee{
	String dept,subject;
	teachers(int e,int s,String n,String a,String d,String sub){
		super(e,s,n,a);
		dept = d;
		subject = sub;
	}		
	void display(){
		System.out.println("\t Department : "+dept);
		System.out.println("\t Subject    : "+subject);
	}
}
class prgm_14{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sal,eid;
		String nm,addr,dep,sub;
		System.out.print("\n\t Enter the total no : of teachers : ");
		int num = Integer.parseInt(sc.nextLine());
		teachers tr[] = new teachers[num];
		for (int i=0;i<num;i++){
			System.out.print("\n\t Enter the Employee id : ");
			eid = Integer.parseInt(sc.nextLine());
			System.out.print("\n\t Enter the Employee name : ");
			nm = sc.nextLine();
			System.out.print("\n\t Enter the Address : ");
			addr = sc.nextLine();
			System.out.print("\n\t Enter the Department : ");
			dep = sc.nextLine();
			System.out.print("\n\t Enter the Subject");
			sub = sc.nextLine();
			System.out.print("\n\t Enter the salary : ");
			sal = Integer.parseInt(sc.nextLine());
			tr[i] = new teachers(eid,sal,nm,addr,dep,sub);
		}
		for (int i=0;i<num;i++){
			tr[i].disp();
			tr[i].display();
		}
	}
}