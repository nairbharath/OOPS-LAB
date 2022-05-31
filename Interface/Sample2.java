class Main{

    public static void main(String[] args) {
       Teacher teacObj[] = new Teacher[2];
       teacObj[0] = new Teacher("1","A","AA",11,"AAA","AAAA");
       teacObj[1] = new Teacher("2","B","BB",11,"BBB","BBBB");
       teacObj[0].display();
       teacObj[1].display();
    }
}

class Person {
	String name;
	int age;
	String address;
	Person(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
}

class Employees extends Person{
    String Empid;
    String Company_name;
    String qualification;
    int Salary;

    Employees(String name,int age,String address,String id,String cname,String quali,int salary){
	super(name,age,address)
        this.Empid   = id;
        this.Name    = cname;
        this.Address = quali;
        this.Salary  = salary;
    }
    
	/*
	void display(){
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Name    : " + this.Name);
        System.out.println("Address : " + this.Address);
        System.out.println("Salary  : " + this.Salary);
	*/
    }

}



class Teacher extends Employees{  
    String Department;
    String Subject;
	//String teacher_id;
    Teacher(String id,String cname,String quali,int salary,String dept,String subj,String tid){
        super(id,cname,quali,salary);
        this.Department=dept;
        this.Subject=subj;
	this.teacher_id=tid;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Dept Name : " + this.Department);
        System.out.println("Subject Name : " + this.Subject);
        System.out.println("..........................................");
    }
}


