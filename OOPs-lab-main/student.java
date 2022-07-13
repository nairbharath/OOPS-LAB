import java.util.*;
class student{
	Scanner obj = new Scanner(System.in);
	int rollno,eng,maths,science,total;
	String name;
	void read_data(){
		System.out.print("\n\t Enter name : ");
		name = obj.nextLine();
		System.out.print("\t Eter roll no : ");
		rollno = obj.nextInt();
		System.out.println("\n\t Enter the marks of "+name);
		System.out.print("\n\t English : ");
		eng = obj.nextInt();
		System.out.print("\t Maths : ");
		maths = obj.nextInt();
		System.out.print("\t Science : ");
		science = obj.nextInt();
	}
	void display(){
		System.out.println("\n\t Name : "+name+"\t Roll number : "+rollno);
		System.out.println("\n\t Subject \t\t Marks");
		System.out.println("\n\t English \t\t "+eng);
		System.out.println("\t Maths \t\t\t "+maths);
		System.out.println("\t Science \t\t "+science);
		total = maths+eng+science;
		System.out.println("\t Total \t\t\t"+total);
	}
	public static void main(String[] args){
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();
		System.out.println("\n\t Enter Student 1 details : ");
		s1.read_data();
		System.out.println("\n\t Enter Student 2 details :");
		s2.read_data();
		System.out.println("\n\t Enter Student 3 details : ");
		s3.read_data();
		s1.display();
		s2.display();
		s3.display();
		if (s1.total>s2.total && s1.total >s3.total)
			System.out.println("\n\t "+s1.name+" has the highest marks \n\t\t Marks : "+s1.total);
		else if (s2.total > s3.total)
			System.out.println("\n\t "+s2.name+" has the highest marks \n\t\t Marks : "+s2.total);
		else
			System.out.println("\n\t "+s3.name+" has the highest marks \n\t\t Marks : "+s3.total);
	}
}