class InterfaceDemo
{
	public static void main (String args[])
	{
		Student s = new Student ("Darezik", 123);
		s.display();
		Test t = new Test(s, 90, 80);
		t.display();
		Result r = new Result(t);
		r.display();
	}
}

class Student
{
	String Name;
	int RollNo;
	Student(String Name, int RollNo)
	{
		this.Name = Name;
		this.RollNo = RollNo;
	}
	Student(Student s)
	{
		this.Name = s.Name;
		this.RollNo = s.RollNo;
	}
	void display()
	{
		System.out.println(Name + " " + RollNo);
	}
}

class Test extends Student
{
	int marks1;
	int marks2;
	Test(Student s, int marks1, int marks2)
	{
		super(s);
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	void display()
	{
		super.display();
		System.out.println("Marks 1 : " + marks1 + " Marks 2 : " + marks2);
	}
}

interface Sports
{
	int sportsMarks = 10;
	void displaySportsMarks();
}

class Result extends Test implements Sports
{
	int data;
	Result(Test t)
	{
		super(new Student(t.Name, t.RollNo),t.marks1,t.marks2);
		data = marks1+marks2;
	}
	public void displaySportsMarks()
	{
		System.out.println("Sports marks : " + sportsMarks);
	}
	void display()
	{
		super.display();
		System.out.println("Total Marks " + data);
	}
}
