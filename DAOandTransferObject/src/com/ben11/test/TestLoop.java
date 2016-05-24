package com.ben11.test;

public class TestLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int x=1; x<=10; x++ )
			System.out.println("Ben: " + x);		
		System.out.println("Sum of 10 series is:" +sumSeries(10));
	}
	
	public static int sumSeries(int maxNum){
		int sum=0;
		for (int minNum=1; minNum <= maxNum; minNum++ )
			sum+=minNum;
		return sum;
	}

}
