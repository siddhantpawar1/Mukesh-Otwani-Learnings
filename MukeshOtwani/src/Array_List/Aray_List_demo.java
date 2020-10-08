package Array_List;

import java.util.ArrayList;

public class Aray_List_demo {

	public static void main(String[] args) {
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(89894);
		obj1.add("M");
		obj1.add("Selenium WebDriver");
		obj1.add(12.2589);
		
		int mylistsize=obj1.size();
		
		for(int i=0;i<mylistsize; i++)
		{
			System.out.println("Values from ArraylistDemo is: "+obj1.get(i));
		}
		

	}

}
