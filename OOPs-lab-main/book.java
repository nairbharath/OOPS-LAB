import java.util.*;
class bk{
	long isbn;
	String title,author,publisher;
	int price;
	Scanner obj = new Scanner(System.in);
	void read(){
		System.out.print("\n\t Enter book title : ");
		title = obj.nextLine();
		System.out.print("\t Enter author name : ");
		author = obj.nextLine();
		System.out.print("\t Enter publisher name : ");
		publisher = obj.nextLine();
		System.out.print("\t Enter price : ");
		price = obj.nextInt();
		System.out.print("\t Enter ISBN : ");
		isbn = obj.nextLong();
	}
	void display(){
		System.out.println("\n\t ISBN : "+isbn);
		System.out.println("\t TITLE : "+title);
		System.out.println("\t AUTHOR : "+author);
		System.out.println("\t PUBLISHER : "+publisher);
		System.out.println("\t PRICE : "+price);
	}

}
class book{
	public static void main(String args[]){
		bk b[] = new bk[5];
		bk b1 = new bk();
		String s;
		int i,j,k=0;
		System.out.println("Enter details of 5 books : ");
		for (i=0;i<5;i++){
			b[i] = new bk();
			System.out.println("\n\t Book ");
			b[i].read();
		}
		for(i=0;i<5;i++){
			for(j=i+1;j<5;j++){
				if (b[i].title.compareTo(b[j].title)>0){
					b1 = b[i];
					b[i] = b[j];
					b[j] = b1;
				}
			}
		}
		for (i=0;i<5;i++){
			System.out.println("\n\t Book "+i-1);
			b[i].display();
		}
	}
}