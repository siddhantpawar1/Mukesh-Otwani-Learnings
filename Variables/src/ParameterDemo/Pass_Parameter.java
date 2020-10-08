package ParameterDemo;

public class Pass_Parameter {

	public static void main(String[] args) 
	{
		
	Pass_Parameter obj1=new Pass_Parameter();
	
	int sum=obj1.add (455, 78);
	System.out.println("Sum of result is "+sum);
	
	double result=obj1.sub(500.154,123.123);
	System.out.println("subtraction of result is :"+result);
	}
	
	public int add(int a, int b)
	{ 
		int c=a+b;
		return c;
	}
	public double sub(double x, double y)
	{ 
		double result=x-y;
		return result;  
		
	}
	

	}


