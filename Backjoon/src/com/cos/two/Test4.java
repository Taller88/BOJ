package com.cos.two;

public class Test4 {

	public static int solution(int[]arr, int K) {
		int cnt=0;
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int z=j+1; z<arr.length; z++) {
					System.out.println(arr[i]+" "+arr[j]+" "+arr[z]);
					if((arr[i]+arr[j]+arr[z])%K==0) {
						cnt++;
					}
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int K=3;
		int[]arr= {1,2,3,4,5};
		System.out.println(solution(arr, K));
	}

}
