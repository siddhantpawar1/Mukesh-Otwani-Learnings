package ParameterDemo;

public class Pass_Demo {

	public static void main(String[] args) 
	{
		
	Pass_Demo obj1=new Pass_Demo();
	
	obj1.add (455, 78);
	obj1.sub (819.53, 513.3);
	}
	
	public void add(int a, int b)
	{ 
		int c=a+b;
		System.out.println("Hey, Result is :"+c );
		
	}
	public void sub(double x, double y)
	{ 
		double z=x-y;
		System.out.println("Hey, Result is :"+z );
		
	}
	

	}


