package Interface;

public class AdvanceCal2 implements cal {

	public static void main(String[] args) {
		
		AdvanceCal2 obj1=new AdvanceCal2();
		
		obj1.add();
		obj1.sub();
		obj1.sinc();
		obj1.cosc();
		
	}
	
	public void sinc()
	{
		System.out.println("The sinc of the number is 60");
	}
	
	public void cosc()
	{
		System.out.println("The cosc of the number is 75");
	}
	
	public void add()
	{
		System.out.println("The additoion of the number is 115");
	}

	
	public void sub() {
		System.out.println("The subtraction of the number is -115");
		
	}
	

}
