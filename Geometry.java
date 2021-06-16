import java.util.Scanner;

public class Geometry
{
	public static double compareMethod(double length , double length1)
{
	double compare = Double.compare(length , length1);

	if ( compare > 0 )
	{
		double sub = ( length - length1);
		System.out.println(length + " is greater than " +length1  );
		return sub;
	}
	else if ( compare < 0 )
	{
		double sub = (length1 - length );
		System.out.println( + length1 + " is greater than " + length );
		return sub;
	}
	else 
	{
		double sub = ( length - length1);
		System.out.println(" both are equal  " + length  + length1 );
		return sub;
	}
	
}
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

				Double length = Math.sqrt(Math.pow((X2 - X1), 2 ) + Math.pow((Y2 - Y1) , 2));
				System.out.println(" the length of the line is " + length);
				
				
				System.out.println( " Enter  M1 : ");
				int M1 = point.nextInt();
				
				System.out.println( " Enter  N1 : ");
				int N1 = point.nextInt();
				
				System.out.println( " Enter  M2 : ");
				int M2 = point.nextInt();
				
				System.out.println( " Enter  N2 : ");
				int N2 = point.nextInt();

				Double length1 = Math.sqrt(Math.pow((M2 - M1), 2 ) + Math.pow((N2 - N1) , 2));
				System.out.println(" the length of the line is " + length1);
				
				compareMethod(length , length1);
			}	

}