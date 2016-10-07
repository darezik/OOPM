class MultithreadingDemo
{
	public static void main (String ar[])
	{
		new A();
		new B();
	}
}
class A extends Thread 
{
	A()
	{
		start();
	}
	public void run()
	{
		try {
			
			for(int i = 0; i < 10; i ++)
			{
				Thread.sleep(500);
				System.out.println("This is in A " + i);
			}
		}
		catch(Exception ex)
		{
			System.out.println("You threw an Exception. " + ex.getMessage());
		}
	}
}
class B extends Thread 
{
	B()
	{
		start();
	}
	public void run()
	{
		try {
			
			for(int i = 0; i < 10; i ++)
			{
				Thread.sleep(500);
				System.out.println("This is in B " + i);
			}
		}
		catch(Exception ex)
		{
			System.out.println("You threw an Exception. " + ex.getMessage());
		}
	}
}
