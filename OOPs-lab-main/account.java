import java.util.*;
class details{
	int acc_no,balance;
	String name,acc_type;
	void insert(int no, String nm,int bal,String actp){
		name=nm;
		balance=bal;
		acc_type=actp;
		acc_no=no;
	}
	void credit(int x){
		balance=balance+x;
		System.out.println("\n\t Amount added successfully ");
	}
	void debit(int x){
		if (balance<1000){
			System.out.println("\n\t Insufficient balance");
		}
		else{
			if((balance-x)<1000)
				System.out.println("\n\t Need 1000 as Minimum balance \n\t Transaction cancelled ");
			else{
				balance=balance-x;
				System.out.println("\n\t Amount debited successfully");
				System.out.println("\n\t Balance : "+balance);
			}
		}
	}
	void display(){
		System.out.println("\n\t\t\t Account details ");
		System.out.println("\t Name : "+name);
		System.out.println("\t Acc no : "+acc_no);
		System.out.println("\t Account type : "+acc_type);
		System.out.println("\t Balance : "+balance);
	}
}
class account{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int choice,amount;
		int acc_no,bal;
		String acc_type,name;
		details d1 = new details();
		System.out.print("\t Enter the name : ");
		name=obj.nextLine();
		System.out.print("\t Enter Account number : ");
		acc_no=obj.nextInt();
		System.out.print("\t Enter balance : ");
		bal=obj.nextInt();
		obj.nextLine();
		System.out.print("\t Enter Account type : ");
		acc_type=obj.nextLine();
		d1.insert(acc_no,name,bal,acc_type);
		do{
		System.out.println("\n\t\t\t MENU ");
		System.out.println("\t 1. Deposit ");
		System.out.println("\t 2. Withdraw ");
		System.out.println("\t 3. Check Balance ");
		System.out.println("\t 4. Next User ");
		System.out.println("\t 5. Exit ");
		System.out.print("\t\t Enter a choice : ");
		choice=obj.nextInt();
		switch(choice){
			case 1:System.out.print("\n\t Enter amount : ");
				amount=obj.nextInt();
				d1.credit(amount);
				break;
			case 2:System.out.print("\n\t Enter amount : ");
				amount=obj.nextInt();
				d1.debit(amount);
				break;
			case 3:d1.display();
				break;
			case 4: System.out.println("\n\t Next user");
					obj.nextLine();
					System.out.print("\t Enter the name : ");
					name=obj.nextLine();
					System.out.print("\t Enter Account number : ");
					acc_no=obj.nextInt();
					System.out.print("\t Enter balance : ");
					bal=obj.nextInt();
					obj.nextLine();
					System.out.print("\t Enter Account type : ");
					acc_type=obj.nextLine();
					d1.insert(acc_no,name,bal,acc_type);
					break;
			case 5:System.out.println("\n\t Program is exiting ...");
			}
		}
		while(choice!=5);
	}
}