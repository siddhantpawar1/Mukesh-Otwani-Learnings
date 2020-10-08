package Polymorphism;

public class COmpile_Demo1 {

	public static void main(String[] args) 
	{
	
	COmpile_Demo1 obj1=new COmpile_Demo1();
	
	obj1.add(45,65);
	obj1.add(15,45,60);
	obj1.add(15.45,60);
	obj1.add(15,45.60);
	obj1.add(15.45,60.45);
	
	}
	
	public void add(int a, int b)
	{
	 int c =a+b;
	 System.out.println("sum of addition of I numbers is: "+c);
	}
	public void add(int a, int b, int d)
	{
	 int c =a+b+d;
	 System.out.println("sum of addition of II number is: "+c);
	}

	public void add(double a, int b)
	{
	 double c =a+b;
	 System.out.println("sum of addition of III number is: "+c);
	}
	public void add(int a, double b)
	{
	 double c =a+b;
	 System.out.println("sum of addition of IV number is: "+c);
	}
	public void add(double a, double b)
	{
	 double c =a+b;
	 System.out.println("sum of addition of V number is: "+c);
	}
}
