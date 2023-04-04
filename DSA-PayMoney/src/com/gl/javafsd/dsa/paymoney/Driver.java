package com.gl.javafsd.dsa.paymoney;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		int size = scanner.nextInt();
		int[] transactionsArray = new int[size];
		System.out.println("Enter the value of transactions");
		for (int index = 0; index < size; index++) {
			transactionsArray[index] = scanner.nextInt();
		}
		System.out.println("Enter the number of target ");
		int noOfTarget = scanner.nextInt();

		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("Enter the value of target");
			int dailyTarget = scanner.nextInt();
			scenario(transactionsArray, dailyTarget);
		}

	}

	static void scenario(int transactionsArray[], int dailyTarget) {
		TargetDeterminator determinator = new TargetDeterminator(transactionsArray, dailyTarget);
		Result result = determinator.determine();
		System.out.println("Target Status-" + result.isTargetAchievedOrNot());
		System.out.println("No of transactions-" + result.getNoOfTransactions());

	}
}
