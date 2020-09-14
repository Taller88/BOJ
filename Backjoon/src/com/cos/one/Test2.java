package com.cos.one;

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println(solution(3));
	}

	private static int solution(int num) {
		int sum=0;
		int[][]arr=new int[num][num];
//		0,0 -> 0,1 -> 0,2 -> 1,2 -> 2,2 -> 2,1 -> 2,0 -> 1,0 -> 1,1
		//f(1)- 1
		//f(2)- 1,3 ->4
		//f(3)- 1,5,9 ->15
		//f(4)- 1,7,13,15-> 36
		return sum;
	}

}
