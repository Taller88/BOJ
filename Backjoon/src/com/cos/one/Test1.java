package com.cos.one;

public class Test1 {

	public static int solution(int num) {
		int answer=0;
//		1, 2, 3, ..., 8, 9, 11, 12, ...
		String[] arr=String.valueOf(num+1).split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("0")) {
				arr[i]="1";
			}
		}
		String tmp="";
		for(int i=0; i<arr.length; i++) {
			tmp+=arr[i];
		}
		
		return Integer.parseInt(tmp);
	}
	public static void main(String[] args) {
		System.out.println(solution(999));
//		9949999
//		9950000 -> 9951111
	}

}
