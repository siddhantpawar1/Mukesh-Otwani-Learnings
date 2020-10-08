package defaul;

import java.util.Arrays;
import java.util.Scanner;


public class UdemyPractise3 {
	
	public static void main(String[] args) 
    { 
		int i = 10, j = 0;
		
		try {
		int c =i/j;
		System.out.println("Output of the diviion is :" +c);
		}
		
		catch (ArithmeticException e){
			
			System.out.println("Cannot divide the number by zero");
		}
        
    }	
    }