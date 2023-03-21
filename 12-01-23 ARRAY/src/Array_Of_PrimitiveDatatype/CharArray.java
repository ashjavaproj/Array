package Array_Of_PrimitiveDatatype;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		char a[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 5 Charector :-");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		System.out.println();
		System.out.println("  * Array char values * ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}

		
		}

	}
