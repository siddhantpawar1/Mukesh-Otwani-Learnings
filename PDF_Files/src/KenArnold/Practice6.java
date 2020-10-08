package KenArnold;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String cnd="yes";
		while (cnd.equals("yes")) {
			
			System.out.println("Enter the amount that you want to withdraw");
			int amount=in.nextInt();
			System.out.println("Please collect your cash: " +amount);
			System.out.println("Do you still want to withdraw");
			cnd= in.next();
		}
		
		String cnd2 ="No";
		while (cnd.equals("No")) {
			System.out.println("It was good to serve you. Have a nice day!");
			break;
			
		}
		
				
	}

}
