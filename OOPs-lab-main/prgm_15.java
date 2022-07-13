import java.util.*;
class person{
	Scanner sc = new Scanner(System.in);
	String name;
	String gender;
	String address;
	int age;
	person(){
		System.out.print("\n\t Enter your name : ");
		name = sc.nextLine();
		System.out.print("\n\t Enter Gender : ");
		gender = sc.nextLine();
		System.out.print("\n\t Enter Address : ");
		address = sc.nextLine();
		System.out.print("\n\t Enter your age : ");
		age = Integer.parseInt(sc.nextLine());
	}
}
class employee extends person{
	int empid;
	String cmp_name;
	String qualification;
	int salary;
	employee(){
		System.out.print("\n\t Enter the Employee id : ");
		empid = Integer.parseInt(sc.nextLine());
		System.out.print("\n\t Enter the Company name : ");
		cmp_name = sc.nextLine();
		System.out.print("\n\t Enter your Qualification : ");
		qualification = sc.nextLine();
		System.out.print("\n\t Enter your Salary : ");
		salary = Integer.parseInt(sc.nextLine());
	}
}
class teachers extends employee{
	String subject;
	String department;
	int teacher_id;
	teachers(){
		System.out.print("\n\t Enter the Teacher id : ");
		teacher_id = Integer.parseInt(sc.nextLine());
		System.out.print("\n\t Enter the Subject : ");
		subject = sc.nextLine();
		System.out.print("\n\t Enter the Department : ");
		department = sc.nextLine();
	}
	void display(){
		System.out.println("\n\t\t PERSONAL DETAILS ");
		System.out.println("\t\t ----------------");
		System.out.println("\t Name      : "+name);
		System.out.println("\t Age       : "+age);
		System.out.println("\t Gender    : "+gender);
		System.out.println("\t Address   : "+address);
		System.out.println("\n\t\t WORKING DETAILS ");
		System.out.println("\t\t --------------- ");
		System.out.println("\t Employee id    : "+empid);
		System.out.println("\t Company Name   : "+cmp_name);
		System.out.println("\t Qualification  : "+qualification);
		System.out.println("\t Salary         : "+salary);
		System.out.println("\n\t\t TEACHER DETAILS ");
		System.out.println("\t\t ---------------");
		System.out.println("\t Teacher id     : "+teacher_id);
		System.out.println("\t Subject        : "+subject);
		System.out.println("\t Department     : "+department);
	}
}
class prgm_15{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("\n\t Enter Total no : of teachers : ");
		int num = Integer.parseInt(read.nextLine());
		teachers tr[] = new teachers[num];
		for (int i=0;i<num;i++){
			System.out.println("\n\t Enter the details of Teacher "+(i+1));
			tr[i] = new teachers();
		}
		for (int i=0;i<num;i++){
			System.out.println("\n\t\tMember "+(i+1));
			System.out.println("\t =======================");
			tr[i].display();
		}
	}
}