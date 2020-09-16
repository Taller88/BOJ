package com.cos.two;

public class Test7 {

	public static int solution(int num) {
//		 동전 : 10원, 50원, 100원, 500원
//		 * 지폐 : 1,000원, 5,000원, 10,000원, 50,000원
		int cnt=0;
		System.out.println(num/50000);
		
		cnt+=num/50000;
		num=num%50000;
		
		cnt+=num/10000;
		num=num%10000;
		cnt+=num/5000;
		num=num%5000;
		
		cnt+=num/1000;
		num=num%1000;
		cnt+=num/500;
		num=num%500;
		cnt+=num/100;
		num=num%100;
		cnt+=num/50;
		num=num%50;
		cnt+=num/10;
		
		return cnt;
		
	}
	public static void main(String[] args) {
		System.out.println(solution(2760));
	}

}
