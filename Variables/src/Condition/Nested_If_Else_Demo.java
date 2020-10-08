package Condition;

public class Nested_If_Else_Demo {

	public static void main(String[] args) {
									
						System.out.println("This is the beginning of IF statement");
						
						String browser = "Siddhant";
						
						if(browser.equalsIgnoreCase("chrome"))
						{
						System.out.println("TC is executed on chrome "+browser);
						}
						else if(browser.equalsIgnoreCase("IE"))
						{
						System.out.println("TC is executed on chrome "+browser);
						}
						
						else if (browser.equalsIgnoreCase("Firefox"))
						{
							System.out.println("TC is executed on chrome "+browser);
						}
						
						else					 
						System.out.println("Kindly provie correct browser Name!!");

					}

				}

