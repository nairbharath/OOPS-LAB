class product{
	int pcode,price;
	String pname;
	void insert(int x,String y,int z){
		pcode=x;
		pname=y;
		price=z;
	}
	void display(){
		System.out.println("\t Code : "+pcode+"\tName : "+pname+"\tPrice : "+price);
	}
	public static void main(String args[]){
		product p = new product();
		p.insert(101,"Rice",50);
		p.display();
		product r = new product();
		r.insert(102,"Wheat",40);
		r.display();
		product q = new product();
		q.insert(103,"Apple",100);
		q.display();
		if(r.price < p.price && r.price < q.price)
			System.out.println(r.pname+" has the lowest price "); 
		else if(p.price < q.price)
			System.out.println(p.pname+" has the lowest price "); 
		else
			System.out.println(q.pname+" has the lowest price ");
	}
}