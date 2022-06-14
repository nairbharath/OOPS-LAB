import java.util.*;

class OverloadDemo
{
    void area(float x)
    {
        float area=x*x;
        System.out.println("Area of a square is: "+area +" sq.units");
    }
    void area(float x,float y)
    {
        float area=x*y;
        System.out.println("Area of a  rectangle is: "+area);
    }
    void area(double x)
    {
        double area=Math.PI*x*x;
        System.out.println("Area of circle: "+area);
    }
}
class Overload
{
    public static void main(String[] args) {
        OverloadDemo obj=new OverloadDemo();
        obj.area(2.5);
        obj.area(5, 6);
        obj.area(5.28f);
        }
    }

