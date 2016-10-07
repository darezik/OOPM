import java.io.*;
class ExceptionDemo
{
	public static void main (String ar[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter 2 numbers : ");
			int b = 0;
			String in = br.readLine();			//IOException
			int a = Integer.parseInt(in); 			//NumberFormatException
			try
			{
				b = Integer.parseInt(br.readLine());	//ex 1 & 2
				System.out.println("a/b = " + (a/b));	//ArithmeticException
			}
			catch(ArithmeticException ex)
			{
				System.out.println("You threw an ArithmeticException " + ex.getMessage());
			}
			int c [] = new int [b];				//NegativeArraySizeException
			System.out.println("You accessed : " + c[a]);	//ArrayIndexOutOfBoundsException
		}
		catch(IOException ex)
		{
			System.out.println("You threw an IOException " + ex.getMessage());
		}
		catch(NumberFormatException ex)
		{
			System.out.println("You threw an NumberFormatException " + ex.getMessage());
		}
		catch(NegativeArraySizeException ex)
		{
			System.out.println("You threw an NegativeArraySizeException " + ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("You threw an ArrayIndexOutOfBoundsException " + ex.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println("You threw an Exception " + ex.getMessage());
		}
		finally
		{
			System.out.println("I will reach here whatever you do");
		}
	}
}
