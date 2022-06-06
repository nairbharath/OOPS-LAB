import java.util.Scanner;

class passwordException1 extends Exception
{
	public passwordException1(String msg)
	{
		super(msg);
	}
	
}
class passwordException2 extends Exception
{
	public passwordException2(String msg)
	{
		super(msg);
	}
	
}

public class checkLogin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String user,pass;
		System.out.println("Enter username: ");
		user=sc.nextLine();
		System.out.println("Enter password: ");
		pass=sc.nextLine();
		int len=pass.length();
		
		try
		{
			if(len<6)
				throw new passwordException1("Password too short. Must be more than 6 characters");
			else if(!pass.equals("lolong"))
				throw new passwordException2("Wrong Password");
				System.out.println("Logged in.");
			
	
		}
		catch(passwordException1 p)
		{
			p.printStackTrace();
		}
		catch(passwordException2 p)
		{
			p.printStackTrace();
		}
		finally
		{
			System.out.println("Noice.");
		}
	}
}
