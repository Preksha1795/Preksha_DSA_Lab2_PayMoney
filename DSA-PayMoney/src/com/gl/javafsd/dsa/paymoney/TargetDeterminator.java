package com.gl.javafsd.dsa.paymoney;

public class TargetDeterminator {
	
	
	private int[]transactionsCountArray;
	private int dailyTarget;
	Result result;
	
	public TargetDeterminator(int[] TransactionsArray, int dailyTarget) {
		this.transactionsCountArray = TransactionsArray;
		this.dailyTarget =dailyTarget;
		 result= new Result();
	}
	
	public Result determine(){
	
		int tempValue =0;
		for(int index=0; index<transactionsCountArray.length; index++) {
			int noOfTransactions = transactionsCountArray[index];
			tempValue= tempValue + noOfTransactions;
			if(tempValue>= dailyTarget) {
				result.setNoOfTransactions(index+1);
				result.setTargetAchievedOrNot(true);
				break;
			}
		}
			return result;
	}

}
