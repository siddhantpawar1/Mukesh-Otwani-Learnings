package Class_Demo;

public class Demo1 {

	int x = 90;
	int y = 100;
	public static void main(String[] args) {
		{
			Demo1 Calc= new Demo1();
			
			Calc.sum();
			System.out.println("x valus is: " +Calc.x);
			System.out.println("y valus is: " +Calc.y);
			System.out.println("End Program");

				}
	}
		public void sum()
		{
		int a =90;
		int b =100;
		int c=a+b;
		System.out.println("Sum of two numbers is: "+c);
		}
}

