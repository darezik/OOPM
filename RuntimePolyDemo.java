class RuntimePolyDemo
{
	public static void main (String args[])
	{
		Student s = new Student ("Darezik", 123);
		Test t = new Test(s, 90, 80);
		System.out.println("\ndisplay() called on a Result Reference which points to a Result Object");
		Result r = new Result(t);
		r.display();
		System.out.println("\nThe method now is called on a Student Reference which points to the same Result Object");
		Student y = r;
		y.display();
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

class Result extends Test implements Sports
{
	int data;
	Result(Test t)
	{
		super(new Student(t.Name, t.RollNo),t.marks1,t.marks2);
		data = marks1+marks2;
	}
	void display()
	{
		super.display();
		System.out.println("Total Marks " + data);
	}
}
