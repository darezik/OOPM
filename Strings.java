import java.util.Scanner;
class Strings 
{
	public static void main (String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Make the string array
		System.out.println("Enter the number of strings : ");
		String a [] = new String [ sc.nextInt() ];
		
		//Accept the data
		System.out.println("Enter the strings : ");
		for (int i = 0; i< a.length; i++)
				a[i] = sc.next();
				
		//Begin Sorting
		for (int i = 0; i < a.length ; i++)
			for (int j = 0; j < a.length -i -1; j++)
				if(a[j].compareTo(a[j+1])>0)
				{
				String temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
					
		//Display result
		for (int i = 0; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
