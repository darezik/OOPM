import java.util.*;

class Vectors
{
	public static void main (String args[])
	{
		Vector v = new Vector(10,5);
		System.out.println("Current capacity : "+v.capacity());
		System.out.println("Current size : "+v.size());
		Integer i = new Integer(10);
		v.addElement(i);
		v.addElement(new Float(3.14159));
		v.insertElementAt(new String("Inserted at 1"),1);
		System.out.println("Does it contain i : "+v.contains(i));
		System.out.println("Current capacity : "+v.capacity());
		System.out.println("Current size : "+v.size());
		v.removeElement(i);
		System.out.println("Does it contain i : "+v.contains(i));
		System.out.println("Current capacity : "+v.capacity());
		System.out.println("Current size : "+v.size());
		for(int j = 0; j < v.size(); j++)
		{
			System.out.println("Element " + (j+1) + " : "+v.elementAt(j));
		}
	}
}
