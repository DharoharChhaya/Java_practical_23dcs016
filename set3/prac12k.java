import java.util.Scanner;

class Emp
{
	Scanner s=new Scanner(System.in);
	String fs;
	String ls;
	double sal;
	
	Emp()
	{
	}
	
	Emp(String f,String l,double s)
	{
		fs=f;
		ls=l;
		sal=s;
	}
	
	void setfs()
	{
		System.out.println("Enter the first name of employee: ");
		fs=s.nextLine();
	}
	
	void setls()
	{
		System.out.println("Enter the last name of employee: ");
		ls=s.nextLine();
	}
	
	void setsal()
	{
		System.out.println("Enter the salary of employee: ");
		sal=s.nextDouble();
		if(sal<0)
		{
			sal=0.0;
		}
		
	}
	double newsal()
	{
          sal=sal+(0.1*sal);
          System.out.println("The raise in salary is :");
          return sal;
	}

	String getfs()
	{ 
		return fs;
	}

	String getls()
	{
		return ls;
	}
	
	double getsal()
	{
		return sal;
	}
		
	
}

class Emptest
{
	public static void main(String a[])
	{
		Emp e1=new Emp();
		Emp e2=new Emp();
		e1.setfs();
		e1.setls();
		e1.setsal();
                e2.setfs();
		e2.setls();
		e2.setsal();
		System.out.println(e1.getfs());
		System.out.println(e1.getls());
		System.out.println(e1.getsal());
                System.out.println(e1.newsal());
		String fname=e2.getfs();
		String lname=e2.getls();
		double salary=e2.getsal();
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(salary);
                System.out.println(e2.newsal());
		
	}
}
