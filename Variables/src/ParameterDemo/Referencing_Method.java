package ParameterDemo;

public class Referencing_Method {

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
	
	
	public static String getMyFullName(String firstname, String lastname)
	{
	
		String fullname=firstname+lastname;
		return fullname;
	}
	
	}


