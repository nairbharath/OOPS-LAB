import java.util.*;
class Employee
{
    int eNo,eSalary;
    String eName;

    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        this.eNo=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the Employee Name: ");
        this.eName=sc.nextLine();
        System.out.println("Enter the Employee Salary: ");
        this.eSalary=Integer.parseInt(sc.nextLine());
    }
    public void display()
    {
        System.out.println("ID: "+eNo+"\tName: "+eName+"\tSalary: "+eSalary);
    }
    public static void main(String args[])
    {
        int n,num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of employees: ");
        n=Integer.parseInt(sc.nextLine());
        Employee emp[] = new Employee[n];
        for(i=0;i<n;i++)
        {
            emp[i]=new Employee();
            emp[i].read();

        }
        
        
        while(true)
        {
            System.out.println("1. Search for an Employee ID\n2.Exit ");
            int ch=Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1:
                System.out.println("Search for an Employee ID: ");
                num=Integer.parseInt(sc.nextLine());
                for(i=0;i<n;i++)
                {
                    if(emp[i].eNo==num)
                    {
                        emp[i].display();
                        break;
                 }
                }
                break;
                case 2:
                    System.out.println("Exiting");System.exit(0);
                    break;

                default:System.out.println("enter valid option ");
            }

    }
}

}