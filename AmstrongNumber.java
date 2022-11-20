package com.test;

public class AmstrongNumber {
	public static void main(String[] args) {
		int number=154;
		int tem=number;
		int result=0;
		while(tem>0) {
			int reminder=tem%10;
			result=result+(reminder*reminder*reminder);
			tem=tem/10;
		}
		
		if(number==result) {
			System.out.println("number is amstrong number");
		}else {
			System.out.println("number is not amstrong number");
		}
	}

}
