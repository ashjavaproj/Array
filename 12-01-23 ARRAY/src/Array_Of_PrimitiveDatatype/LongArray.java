package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class LongArray {

	public static void main(String[] args) {
		long a[]=new long[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 Long no :-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLong();
		}
		System.out.println();
		System.out.println("  * Array Long values * ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}

		
		}

	}
