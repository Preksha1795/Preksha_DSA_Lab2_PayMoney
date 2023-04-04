package com.gl.javafsd.dsa.paymoneytest;

import com.gl.javafsd.dsa.paymoney.Result;
import com.gl.javafsd.dsa.paymoney.TargetDeterminator;

public class TargetDeterminatorTest {
	public static void main(String[] args) {
		
		scenario1();
		
	}
	static void scenario(int transactionsArray[],int dailyTarget) {
		TargetDeterminator determinator 
		= new TargetDeterminator(transactionsArray,dailyTarget );
		Result result = determinator.determine();
		System.out.println("Target Status-"+ result.isTargetAchievedOrNot());
		System.out.println("No of transactions-" + result.getNoOfTransactions());
	}
	static void scenario1() {
		int transactionsArray[] = {20,12,31};
		int dailyTarget =21;
		 scenario( transactionsArray, dailyTarget);
		
	}
	static void scenario2() {
		int transactionsArray[] = {20,12,31};
		int dailyTarget =19;
		 scenario( transactionsArray, dailyTarget);
		
	}
	static void scenario3() {
		int transactionsArray[] = {100};
		int dailyTarget =101;
		
		 scenario( transactionsArray, dailyTarget);
	}
}
