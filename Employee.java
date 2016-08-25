import java.util.*;

class Employee 
{
	int No;
	String Name;
	double Salary;
	
	Employee (int No, String Name, double Salary)
	{
		this.No = No;
		this.Name = Name;
		this.Salary = Salary;
	}

	static void sortEmployeeArray(Employee [] emList)
	{
		for(int i = 0; i < emList.length - 1; i++)
			for (int j = 0; j < emList.length - 1; j++)
				if (emList[j].Salary < emList[j+1].Salary)
 				{
					Employee temp = emList[j];
					emList[j] = emList[j + 1];
					emList[j + 1] = temp;
				}
				
	}
	static void displayEmployeeArray(Employee[] emList)
	{
		System.out.println("No\tName\tSalary");
		for(int i = 0; i< emList.length; i++)
		{
			System.out.println(emList[i].No + "\t" + emList[i].Name + "\t" + emList[i].Salary);
		}
		System.out.println();
	}
}
class Wrapper
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of employees : ");
		int n = sc.nextInt();
		System.out.println();
		Employee [] emList = new Employee[n];
		for(int i = 0; i< emList.length; i++)
		{
			System.out.println("Enter no, then name, then salary : ");
			emList[i] = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
			System.out.println();
		}
		Employee.displayEmployeeArray(emList);
		Employee.sortEmployeeArray(emList);
		Employee.displayEmployeeArray(emList);
	}
}
