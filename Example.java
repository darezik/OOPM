/* 29 July 2016
 * Author : Darezik Damkevala
 * OOPM
 * Semester 3 - B. Eng. (Comp)
 */
import java.io.*;
class Example
{
        public static void main (String args [] ) throws Exception
        {
        		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch;
			do{
			System.out.println();
			System.out.println("0 > Demo All");
			System.out.println("1 > Quadratic Equation");
			System.out.println("2 > Pascal Triangle");
			System.out.println("999 > Exit");
			System.out.print("Enter the integer corresponding to your option : ");
			ch = Integer.parseInt(br.readLine());
			switch (ch)
			{
			case 0 : 
			System.out.println("\nQuadratic Equations : ");
			Quadratic q1 = new Quadratic(2, 5, 3);
			q1.displayRoots();
			System.out.println("\nPascal Triangles : ");
			for (int i = 5; i < 10; i++)
				(new Pascal(i)).display();
			break;
			
			case 1 : 
				System.out.println("\nQuadratic Equation ");
                Quadratic q = new Quadratic();
                q.getCoefficient();
                q.displayRoots();
				break;
			case 2 : 
			System.out.println("\nPascal Triangle ");
			System.out.print("Enter number of rows : ");
			Pascal p = new Pascal(Integer.parseInt(br.readLine()));
			break;
			}
			}while(ch!=999);
			
        }
}




