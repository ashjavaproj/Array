package Array_Of_NonPrimitiveDatatype;

import java.util.Scanner;

public class CompTest {
	
	public static void main(String[] args) {
		Company cp[]=new Company[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Company Information");
		for(int i=0;i<cp.length;i++)
		{
			Company c=new Company();
			System.out.print("Enter Company ID = ");
			c.setCid(sc.nextInt());
			
			System.out.print("Enter company Name = ");
			c.setCname(sc.next());
			
			System.out.print("Enter Company Contact no = ");
			c.setContactno(sc.nextLong());
			
			System.out.print("Enter Company Address = ");
			c.setCaddr(sc.next());
			
			System.out.print("Enter Company Location = ");
			c.setCloc(sc.next());
			cp[i]=c;
			
			System.out.println();
		}
		System.out.println("  *~*~* COMPANY DETAILS *~*~*~* ");
		System.out.println("----------------------------------------");
		for(int i=0;i<cp.length;i++)
		{
			
			System.out.println("  Company ID          = "+cp[i].getCid());
			System.out.println("  Company Name        = "+cp[i].getCname());
			System.out.println("  Company Contact No  = "+cp[i].getContactno());
			System.out.println("  Company  Address    = "+cp[i].getCaddr());
			System.out.println("  Company Location    = "+cp[i].getCloc());
			System.out.println();
		}
	}
}
