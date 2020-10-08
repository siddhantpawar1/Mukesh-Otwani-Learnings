package String;

public class String_demo2 {

	public static void main(String[] args) {
		 
		String actuals="Welcome to Selenium webdriver world";
		
		String expected="welcome to selenium webdriver world";
		
		boolean status = actuals.equalsIgnoreCase(expected);
		
		System.out.println("Status is :" +status);
		

	}

}
