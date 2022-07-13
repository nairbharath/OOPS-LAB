
import java.io.*;
import java.util.*;
public class copy_file
{
    public static void main(String arg[])
    {
        FileWriter fw = null;
        BufferedWriter  bw = null;
        try
        {
            fw = new FileWriter("hii.txt");
            bw = new BufferedWriter(fw);
            Scanner sc= new Scanner(System.in);
            String s =" ";
            while(!s.equals("quit"))
            {
                s = sc.nextLine();
                bw.write(s);
                bw.newLine();
                bw.flush();

            }
            fw.close();
            bw.close();
        }
        catch(Exception e)
        {}
        //copy to aother file
        try{
            FileReader fr = new FileReader("hii.txt");
            BufferedReader br = new BufferedReader(fr);
            String s =" ";
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
                bw.write(s);
                bw.newLine();
                bw.flush();

            }
            fr.close();
            br.close();
        }
        catch(Exception e)
        {

        }
    }
}