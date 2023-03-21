package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		double a[]=new double[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 Double no :-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println();
		System.out.println("  * Array Double values * ");

		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}

		
		}

	}


	


