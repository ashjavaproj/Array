package Array_Of_NonPrimitiveDatatype;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		Employee ep[]=new Employee[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Information");
		for(int i=0;i<ep.length;i++)
		{
			Employee e=new Employee();
			System.out.print("Enter Employee ID         = ");
			e.setEid(sc.nextInt());
			
			System.out.print("Enter Employee Name       = ");
			e.setEname(sc.next());
			
			System.out.print("Enter Employee Contact no = ");
			e.setEmobno(sc.nextLong());
			
			System.out.print("Enter Employee Salary     = ");
			e.setEsal(sc.nextDouble());
			
			
			System.out.print("Enter employee Address    = ");
			e.setAddress(sc.next());
			
			System.out.print("Enter Employee Height     = ");
			e.setEheight(sc.nextDouble());
			
			
			System.out.print("Enter Employee Weight     = ");
			e.setEweight(sc.nextDouble());
			ep[i]=e;
			
			System.out.println();
		}System.out.println("  *~*~* EMPLOYEE RECORDS *~*~*~* ");
		System.out.println("----------------------------------------");
		for(int i=0;i<ep.length;i++)
		{
			
			System.out.println("  Employee ID           = "+ep[i].getEid());
			System.out.println("  Employee Name         = "+ep[i].getEname());
			System.out.println("  Employee Contact No   = "+ep[i].getEmobno());
			System.out.println("  Employee  Address     = "+ep[i].getEsal());
			System.out.println("  Employee Height       = "+ep[i].getAddress());
			System.out.println("  Employee  Salary      = "+ep[i].getEheight());
			System.out.println("  Employee Weidth       = "+ep[i].getEweight());
			System.out.println();
		}
	}
 

	}


