import java.util.Scanner;

class area
{
	Scanner s=new Scanner(System.in);
	int l,b;
	area()
	{}
	area(int len,int bred)
	{
		l=len;
		b=bred;
	}
	int returnarea()
	{
		return l*b;
	}
}

class rectTest
{
	public static void main(String a[])
	{
		rect r1=new rect(5,7);
		System.out.println("The area is: "+r1.area());

	}
}




