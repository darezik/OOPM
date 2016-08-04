import java.io.*;

class Pascal
{
	double rows;
	public Pascal()
	{
		rows = 5;
	}
	public Pascal(int rows)
	{
		this.rows = rows;
	}
	int factorial(int n)
	{
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
			return fact;
	}
	int combination(int n, int r)
	{
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	void display()
	{
		System.out.println("\n\n");
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j<rows-i; j++)
			{
			System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
			System.out.print(combination(i,j) + " ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}
}

