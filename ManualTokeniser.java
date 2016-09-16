import java.util.Scanner;
class ManualTokeniser 
{
	public static void main (String ar[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Make the string and splitting array
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		String a [] = new String [ s.length() ];
		int counter = 0;
		
		//Begin Splitting
		a[0] = "";
		for (int i = 0; i < a.length ; i++)
		{
			if(Character.isLetter(s.charAt(i)))
				a[counter] = a[counter] + s.charAt(i) ;
			else if (!a[counter].equals(""))
			{
				a[++counter] = s.charAt(i)+"";
				counter++;
				a[counter] = "";
			}
		}
		counter ++;
		//Display result
		for (int i = counter -1; i >= 0 ; i--)
		{
			System.out.print(a[i]);
		}
		
	}
}
