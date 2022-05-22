package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.println("------------------");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		System.out.println();
		System.out.print("Enter ammount for withdrawn: ");
		double ammount = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		try {
			acc.withdraw(ammount);
			System.out.printf("New balance: %.2f%n", +acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
