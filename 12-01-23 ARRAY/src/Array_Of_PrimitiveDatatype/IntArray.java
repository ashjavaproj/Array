package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class IntArray {
	public static void main(String[] args) {
		int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 5 Whole no :-");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println();
	System.out.println("  * Array Integer values * ");

	for(int i=0;i<a.length;i++)
	{
		
		System.out.println(a[i]);
	}

	
	}

}
