package Interface;

public class AdvanceCal implements cal {

	public static void main(String[] args) {
		
		//cal obj1=new cal();
		//you cannot create object of interface
		
		//AdvanceCal obj1=new cal()
		//child to parent - not possible
		
		cal obj1=new AdvanceCal();
			
		
		obj1.add();
		obj1.sub();
		//obj1.sinc();
		//obj1.cosc();
		
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
		System.out.println("The addition of the number is 115");
	}

	
	public void sub() {
		System.out.println("The subtraction of the number is -115");
		
	}
	

}
