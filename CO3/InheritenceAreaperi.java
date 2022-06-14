import java.util.*;

interface Shape
{
    final float PI=3.14F;
    void area();
    void peri();

}
class Circle implements Shape
{
    float r,area,peri;
    Scanner sc=new Scanner(System.in);

    public void area()
    {
        System.out.println("Enter the radius for area ");
        r=Integer.parseInt(sc.nextLine());
        area=PI*r*r;
        System.out.println("Area of circle : "+area);
    } 

    public void peri()
    {
        System.out.println("Enter the radius for peri: ");
        r=Integer.parseInt(sc.nextLine());
        peri=2*PI*r;
        System.out.println("Peri of circle : "+peri);
    } 
    
}

class Rectangle implements Shape
{
    float l,b,area,peri;
    Scanner sc=new Scanner(System.in);

    public void area()
    {
        System.out.println("Enter the length and breadth for area ");
        l=Integer.parseInt(sc.nextLine());
        b=Integer.parseInt(sc.nextLine());
        area=l*b;
        System.out.println("Area of rectangle : "+area);
    } 

    public void peri()
    {
        System.out.println("Enter the length and breradth for peri: ");
        l=Integer.parseInt(sc.nextLine());
        b=Integer.parseInt(sc.nextLine());
        peri=2*(l+b);
        System.out.println("Peri of Rectangle : "+peri);
    } 
    
}
class InheritenceAreaperi
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        int ch;
        while(true)
        {
            System.out.println("Choices:\n1.Area of Circle\n2.Peri of Circle\n3.Area of Rect\n4.Peri of Rect\n5.Exit\nEnter a choice :");
            ch=Integer.parseInt(sc.nextLine());
            switch(ch)
            {
                case 1: c.area();break;
                case 2: c.peri();break;
                case 3: r.area();break;
                case 4: r.peri();break;
                case 5: System.out.println("Exiting"); System.exit(0);break;
                default:System.out.println("Invalid option.");
            }

        }
    }
}