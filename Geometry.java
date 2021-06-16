import java.util.Scanner;

public class Geometry
{
			public static void main(String args[])
			{
				Scanner point = new Scanner(System.in);
				
				System.out.println( " Enter  X1 : ");
				int X1 = point.nextInt();
				
				System.out.println( " Enter  Y1 : ");
				int Y1 = point.nextInt();
				
				System.out.println( " Enter  X2 : ");
				int X2 = point.nextInt();
				
				System.out.println( " Enter  Y2 : ");
				int Y2 = point.nextInt();

				double length = Math.sqrt(Math.pow((X2 - X1), 2 ) + Math.pow((Y2 - Y1) , 2));
				System.out.println(" the length of the line is " + length);
				
			}	

}