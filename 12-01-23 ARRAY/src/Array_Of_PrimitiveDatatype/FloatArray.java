package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		float a[]=new float[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 Float no :-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();
		}
		System.out.println();
		System.out.println("  * Array Float values * ");

		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}

		
		}

	}
