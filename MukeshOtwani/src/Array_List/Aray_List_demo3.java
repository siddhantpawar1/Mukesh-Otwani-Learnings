package Array_List;

import java.util.ArrayList;

public class Aray_List_demo3 {

	public static void main(String[] args) {
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(89894);
		obj1.add("M");
		obj1.add("Selenium WebDriver");
		obj1.add(12.2589);
		
		for(Object abc:obj1)
		{
			System.out.println("Values of the Array list is: "+abc);
		}
		

	}

}
