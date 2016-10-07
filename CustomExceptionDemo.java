import java.io.*;
class InvalidCredentialsException extends Exception 
{
	public String getMessage()
	{
		return "The username or password is invalid.";
	}
}
class CustomExceptionDemo
{
	public static void main (String ar[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter username and password : ");
			
			String username = br.readLine();			
			String password = br.readLine();			
			
			if(username.equals("Darezik") && password.length() > 5)
				System.out.println("You have been granted access.");
			else
				throw new InvalidCredentialsException();
				
		}
		catch(InvalidCredentialsException ex)
		{
			System.out.println("You threw an InvalidCredentialsException. " + ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("You threw an Exception. " + ex.getMessage());
		}
	}
}
