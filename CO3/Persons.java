import java.util.*;

class Person
{
    String name,gender,address;
    int age;

    Person(String name, String gender, String addr, int age)
    {
        this.name=name;
        this.gender=gender;
        this.address=addr;
        this.age=age;
    }

    void display()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Gender: "+this.gender);
        System.out.println("Address: "+this.address);
        System.out.println("Age: "+this.age);
    }
}

class Employee extends Person
{
    int empId,salary;
    String companyName,qualification;

    Employee(String name,String gen, String add, int age, int id, String comp,String qual, int salary)
    {
        super(name,gen,add,age);
        this.empId=id;
        this.companyName=comp;
        this.qualification=qual;
        this.salary=salary;
    }
    void display()
    {
        super.display();
        System.out.println("ID: "+this.empId);
        System.out.println("CompanyName: "+this.companyName);
        System.out.println("Qualification: "+this.qualification);
        System.out.println("Salary: "+this.salary);
    }


}

class Teacher extends Employee
{
    String subject,department;
    int teacherId;

    Teacher(String name,String gen,String add,int age,int Id,
    String comp,
    String qual,int salary, String subj,
    String dept,int tId)
    {
        super(name,gen,add,age,Id,comp,qual,salary);
        this.department=dept;
        this.subject=subj;
        this.teacherId=tId;

    }

    void display()
    {
        super.display();
        System.out.println("Subject: "+this.subject);
        System.out.println("Department: "+this.department);
        System.out.println("Salary: "+this.salary);
    }
}
class Persons{
public static void main(String[] args) {
    Teacher tObj[]=new Teacher[2];
    tObj[0]=new Teacher("Name1","gender1","addr1",
    45,1234,"comp name1",
    "phd",12000,"CA","CS",34);
    tObj[1]=new Teacher("Name2","gender2","addr2",46,
    1245,"cmp name 2",
    "mphil",13000,"CN","CS",35);
    tObj[0].display();
    tObj[1].display();
}
}
