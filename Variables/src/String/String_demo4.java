package String;

public class String_demo4 {

	public static void main(String[] args) {
		 
		String fullname ="Selenium-HP-QTP-Grid";
		String[]toolsname=fullname.split("-");
		
		for(int i=0;i<toolsname.length;i++)
		{
		System.out.println("value of "+i+"is: "+toolsname[i]);	
		
		
		if(toolsname[i].equalsIgnoreCase("selenium"))
		{
			System.out.println("Test Passed");
		}
		}
		}
	}


