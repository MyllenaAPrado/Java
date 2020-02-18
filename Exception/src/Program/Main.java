package Program;

import java.util.Locale;
import java.util.Scanner;

import entites.exceptions.AccountException;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//initial program
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		sc.nextLine();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		//instantiate the class
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		try {
			//System.out.println(account.createdAt = new Timestamp(System.currentTimeMillis()));
			System.out.print("Ener amount for withdraw: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " + account.getBalance());
		}catch(AccountException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}finally {
			System.out.println("Close account");
		}
		
		sc.close();

	}

}
