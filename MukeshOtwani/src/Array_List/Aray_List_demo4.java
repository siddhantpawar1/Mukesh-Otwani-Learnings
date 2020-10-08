package Array_List;

import java.util.ArrayList;
import java.util.Iterator;

public class Aray_List_demo4 {

	public static void main(String[] args) {
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(89894);
		obj1.add("M");
		obj1.add("Selenium WebDriver");
		obj1.add(12.2589);
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println("Values are: "+value);
			
		}

	}

}
