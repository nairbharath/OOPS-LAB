import java.util.*;
class main
{
    ArrayList<String> ar = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    String name;
    void add()
    {      
        System.out.print("\n\t Enter a string : ");
        name = sc.next();
        ar.add(name);
        display();
    }
    void remove()
    {
        System.out.print("\n\t Enter the element to remove : "); 
        name = sc.next();
        ar.remove(name);
        System.out.println( "\n\t\t After removal \n\t -----------------");
        display();
    }
    void replace()
    {
        System.out.print("\n\t Enter the string to replace : ");
        name = sc.next();
        System.out.print("\n\t Enter the position to replace : ");
        int pos = sc.nextInt();
        pos--;
        ar.set(pos,name);
        System.out.println("\n\t\t After replacement \n\t --------------------");
        display();
    }
    void sort()
    {
        Collections.sort(ar);
        display();
    }
    void size()
    {
        System.out.println("\n\t\t Size of the arraylist = "+ ar.size());
    }
    void display(){
        System.out.println("\n\t ArrayList : "+ar);
    }
}
class arraylist
{
    public static void main(String arg[])
    {
        int n;
        Scanner sc =new Scanner(System.in);
        main m=new main();
        do
        {
        System.out.println("\n\n\t BUILT IN OPERATION IN ARRAY LIST");
        System.out.println("\n\t==================================");
        System.out.println("\n\t\tCASE 1 : ADD ");
        System.out.println("\n\t\tCASE 2 : REMOVE ");
        System.out.println("\n\t\tCASE 3 : REPLACE ");
        System.out.println("\n\t\tCASE 4 : SORT ");
        System.out.println("\n\t\tCASE 5 : SIZE ");
        System.out.println("\n\t\tCASE 6 : EXIT ");
        System.out.print("\n\t enter your choice = ");
        n=sc.nextInt();
            switch(n)
            {
                case 1: m.add();
                        break;
                case 2: m.remove();
                        break;
                case 3: m.replace();
                        break;
                case 4: m.sort();
                        break;
                case 5: m.size();
                        break;
                case 6: System.out.println("\n\t\t program exiting ....!!!!");
                        break;
                default: System.out.println("\n\t\ttry another menu...!!");
            }
        }
        while(n!=6);
    }
}