package ParameterDemo;

public class Call_Referencing_method {

	public static void main(String[] args) 
	{
	Referencing_Method obj1=new Referencing_Method();
	
	int sum=obj1.add(455, 78);
	System.out.println("Sum of result is: "+sum);
	
	double result=obj1.sub(500.154,123.123);
	System.out.println("subtraction of result is: "+result);
	
	String fullname =Referencing_Method.getMyFullName("Siddhant", "Pawar");
	System.out.println("Congrats your name is: " +fullname);
	}
	
}
