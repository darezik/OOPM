import java.util.*;

class stringReplacer
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string and a word to replace + word to put instead on the next line : \n");
		System.out.println(sc.nextLine().replace(sc.next(),sc.next()));
	}
}
