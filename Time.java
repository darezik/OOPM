import java.util.*;

class Time
{
	int h,m,s;
	Time(){ }
	Time(int h, int m, int s)
	{
		this.h = h + (m + s/60)/60;
		this.m = (m + s/60)%60;
		this.s = s%60;
	}
	void display()
	{
		System.out.println(h + ":" + m + ":" + s);
	}
	Time add(Time t)
	{
		return new Time(h + t.h, m + t.m, s + t.s); 
	}
}
class Wrapper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours, then minutes, then seconds : ");
		Time t1 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		t1.display();
		System.out.println("Enter hours, then minutes, then seconds : ");
		Time t2 = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
		t2.display();
		t1.add(t2).display();
	}
}
