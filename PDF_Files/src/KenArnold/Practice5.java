package KenArnold;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		for (int i=0;i<3;i++){
		System.out.println("Enter the Pin Number:");
		int pinNumber = in.nextInt();
		
		if (pinNumber == 1234) {
		System.out.println("Welcome");
		break;
		} else {
		System.out.println("Invalid Pin Number");
		}
		if (i==2) {
		System.out.println("Your Card is blocked");
		}
		}

	}

}
