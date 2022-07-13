import java.util.*;
class Emp{
	int eno;
	String ename;
	Emp(int e,String n){
		eno=e;
		ename=n;
	}
	void display(){
		System.out.print(eno+"\t"+ename);
	}
}
public class Employee_11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Emp e[] = new Emp[2];
		for (int i=0;i<2;i++){
			System.out.print("\n\t Enter Employee number : ");
			int en = sc.nextInt();
			System.out.print("\n\t Enter Employee name : ");
			String n = sc.next();
			e[i] = new Emp(en,n);
		}
		for (Emp i:e){
			i.display();
		}
	}
}