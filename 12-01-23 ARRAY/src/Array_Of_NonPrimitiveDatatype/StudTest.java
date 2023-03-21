package Array_Of_NonPrimitiveDatatype;

import java.util.Scanner;

public class StudTest {

		Student st[]=new Student[2];
		Scanner sc=new Scanner(System.in);
		public void m1()
		{
		for(int i=0;i<st.length;i++)
		{
			Student s=new Student();
			System.out.print("Enter Rollno = ");
			s.setRollno(sc.nextInt());
			
			System.out.print("Enter Name = ");
			s.setName(sc.next());
			
			System.out.print("Enter Height = ");
			s.setHeight(sc.nextDouble());
			
			System.out.print("Enter Address = ");
			s.setAddr(sc.next());
			st[i]=s;
		}
		}
		public void m2()
		{
			
			System.out.println();
		System.out.println("  *~*~* STUDENT RECORD *~*~*~* ");
		System.out.println("----------------------------------------");
		for(int i=0;i<st.length;i++)
		{
			
			System.out.println("Student Rollno    = "+st[i].getRollno());
			System.out.println("Student Name      = "+st[i].getName());
			System.out.println("Student Height    = "+st[i].getHeight());
			System.out.println("Student Address   = "+st[i].getAddr());
			System.out.println();
		}
		}
		public static void main(String[] args) {
			
			StudTest s1=new StudTest();
			s1.m1();
			s1.m2();
		
	}

}
