import java.io.*;

class Quadratic
{
	double a, b, c;
	public Quadratic()
	{
		a = 0;
		b = 0;
		c = 0;
	}
	public Quadratic(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void displayRoots ()
	{
		System.out.println("\n\nConsidering the equation " + a + "x^2 + " + b + "x + " + c );
		if(a == 0)
		{
			System.out.println("Not a quadratic equation");
			return;
		}
		double d = b*b - 4*a*c;
		if(d == 0 )
			System.out.println("Has equal roots which are " + (-b/(2*a)));
		else if(d < 0)
			System.out.println("Has imaginary roots which are " + (-b/(2*a)) + " +/- " + Math.sqrt(d)/(2*a) + " i ");
		else if(d > 0)
			System.out.println("Has real roots which are " + ((-b+Math.sqrt(d))/(2*a)) + " and " + ((-b-Math.sqrt(d))/(2*a)) + " i ");
	}
	public void getCoefficient() throws Exception
	{
		System.out.println("Enter the coefficients a, b and c for ax^2 + bx + c : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Double.parseDouble(br.readLine());
        b = Double.parseDouble(br.readLine());
        c = Double.parseDouble(br.readLine());
	}
}

