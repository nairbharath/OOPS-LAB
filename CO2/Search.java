import java.util.*;
class Search
{
    int count;
    int array[]=new int[10];

    public void get_array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        count=Integer.parseInt(sc.nextLine());

        System.out.println("Enter elements: ");
        for(int i=0;i<this.count;i++)
        {
            array[i]=Integer.parseInt(sc.nextLine());
        }
    }
    public void search_array()
    {
        int num,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        num=Integer.parseInt(sc.nextLine());
        for(i=0;i<count;i++)
        {
            if(array[i]==num)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println(num+" is present.");
        }
        else{
            System.out.println(num+" is not present.");
        }
    }

        
        public static void main(String args[])
        {
            Search data=new Search();
            data.get_array();;
            data.search_array();
        }
}
