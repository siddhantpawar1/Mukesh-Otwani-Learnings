package Inheritance;

public class Calling_Inheritance_Class extends Inheritance_Demo {

	public static void main(String[] args) {
	
		Calling_Inheritance_Class obj1 = new Calling_Inheritance_Class();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	}
		public void mul()
		{
		System.out.println("Multiplication is 999");
		}
		public void div()
		{
		System.out.println("Division is 666");
		}

	}


