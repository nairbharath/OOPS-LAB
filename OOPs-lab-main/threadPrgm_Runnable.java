import java.util.*;
class thread1 implements Runnable
{
    
    public void run()
    {
      int a=0, b=1,c,n=10;
      System.out.println("fibonacci numbers = ");
      System.out.println(a);
      System.out.println(b);
      for(int i=1;i<n;i++)
      {
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;

      }
    }
}

class thread2 implements Runnable
{
    public void run()
    {
        int n=20;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println("even numbers = " + i);
            }
        }
    }
}

public class threadPrgm_Runnable
{
    public static void main(String arg[])
    {

        thread1 t1 =new thread1();
        Thread T1 = new Thread(t1);
        T1.start();

        
        thread2 t2 =new thread2();
        Thread T2 = new Thread(t2);
        T2.start();
    }
}