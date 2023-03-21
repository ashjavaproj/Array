package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class ShortArray {
	public static void main(String[] args) {

	short a[]=new short[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any 5 Short no :-");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextShort();
	}
	System.out.println();
	System.out.println("  * Array Short values * ");
	System.out.println();
	for(int i=0;i<a.length;i++)
	{
		
		System.out.println(a[i]);
	}

	
	}

}



