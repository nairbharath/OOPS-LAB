import java.util.*;
import java.lang.*;
class Myexception extends Exception{
	Myexception(String message){
		super(message);
	}
}
class testException{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t Enter the limit : ");
		int n = sc.nextInt();
		int sum = 0,num=0;
		System.out.println("\n\t Enter "+n+" numbers \n");
		for (int i=0;i<n;i++){
			System.out.print("\t Enter number "+(i+1)+" : ");
			try{
				num = Integer.parseInt(sc.next());
				if (num<0){
					throw new Myexception("\n\t Only positive numbers are possible \n");
				}
			}
			catch(Exception e){
				System.out.println("\n\t Error !!! \n\t Try again");
				if (num<0){
					System.out.println(e.getMessage());
					}
				i--;
				continue;
			}
			sum = sum + num;
		}
		System.out.println("\n\t Average = "+(sum/n));
	}
}