
package com.bankOperations;

import java.util.Scanner;

import com.bankOperations.operations.Operations;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner userchoice = new Scanner(System.in);
		 
		boolean exit = false;
		do {
			System.out.println("choose from below options");
			System.out.println("1.Create account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Credit Interest");
			System.out.println("5. exit");
			System.out.println("Enter your choice");
		    int	customerChoice = userchoice.nextInt();
			switch (customerChoice) {
			case 1:
				Operations.createAccount();
				break;
			case 2:
				Operations.depositMoney();
				break;
			case 3:
				Operations.withdrawMoney();
				break;
			case 4:
				Operations.calculateInterest();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println(" Choose valid option");

			}
		} while (!exit);
	}

}
