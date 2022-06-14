import java.util.*;
interface Sports
{
    public void sports_getData();
    public void sports_displayData();
}

class Student
{
    String name;
    int rollno;
    float mark1,mark2;

    Student(String n, int rn, float m1, float m2)
    {
        this.name=n;
        this.rollno=rn;
        this.mark1=m1;
        this.mark2=m2;
    }
    void display()
    {
        System.out.println("Student details\nName of Student: "
        +this.name+"\nRoll NO: "+this.rollno
        +"\nMarks1: "+this.mark1+"\nMarks2: "+this.mark2);
    }
}

class Result extends Student implements Sports
{
    int rank;
    String item;
    Scanner sc=new Scanner(System.in);

    Result(String n, int rn, float m1, float m2)
    {
        super(n,rn,m1,m2);
        

    }

    public void academic()
    {
        float total=mark1+mark2;
        float percent=total*100/200;
        System.out.println("Academics\nPercentage: "+percent+" %");
    }

    public void sports_getData()
    {
        System.out.println("Enter sports game: ");
        item=sc.nextLine();
        System.out.println("Enter rank position obtained: ");
        rank=Integer.parseInt(sc.nextLine());

    }
    public void sports_displayData()
    {
        System.out.println("Sports Info:\nGame: "+item+"\nRank: "+rank);
    }
}

class InheritenceSports
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String n=sc.nextLine();
        System.out.println("Enter a roll number: ");
        int rn=Integer.parseInt(sc.nextLine());
        System.out.println("Enter mark 1: ");
        float m1=Integer.parseInt(sc.nextLine());
        System.out.println("Enter mark 2: ");
        float m2=Integer.parseInt(sc.nextLine());
        Result obj = new Result(n,rn,m1,m2);
        obj.sports_getData();
        obj.display();
        obj.academic();
        obj.sports_displayData();
        
    }
}