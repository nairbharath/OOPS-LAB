import java.util.Scanner;

class negException extends Exception
{
	public negException(String msg);
	{
		super(msg);
	}
}

public class avgNumbers
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many numbers?: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;

		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Enter Number "+(i+1)+":");
			try
			{
				if(
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		sc.close();
		
		double avg=sum/arr.length;
		
		System.out.println("Sum : "+sum+ "\tAverage: "+avg);
	}
}
