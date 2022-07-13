import java.io.*;
import java.util.*;
 class even_odd_file
{
    public static void main(String arg[])
    {
        try
        {
            FileReader fw = new FileReader("number.txt")            ;
            BufferedReader br = new BufferedReader(fw);

            FileWriter fw1 = new FileWriter("even.txt");
            BufferedWriter bw1 = new BufferedWriter(fw1);

            FileWriter fw2 =new FileWriter("odd.txt");
            BufferedWriter bw2 = new BufferedWriter(fw2);

            String s=" ";
            int a=0;
            while((s=br.readLine())!=null)
            {
                a = Integer.parseInt(s);
                System.out.println(a);
                if(a%2==0)
                {
                    bw1.write(Integer.toString(a));
                    bw1.newLine();

                }
                else{
                    bw2.write(Integer.toString(a));
                    bw2.newLine();
                }
            }
            bw1.flush();
            bw2.flush();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}