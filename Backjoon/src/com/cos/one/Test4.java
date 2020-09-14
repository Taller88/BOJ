package com.cos.one;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {

		int[]a={-2, 3, 5, 9}; 
		int[]b= {0, 1, 5}; 
		int[] tmp=solution(a,b);
		int[] result= {-2, 0, 1, 3, 5, 5, 9};
		System.out.println(tmp.equals(result));
		for(int i=0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
	}

	private static int[] solution(int[] a, int[] b) {
		int[] result=new int[a.length+ b.length];
		int i=0;
		for(i=0; i<result.length; i++) {
			if(i<a.length) {
				result[i]=a[i];
			}else {
				System.out.println("i: "+i);
				result[i]=b[i-a.length];
			}
		}
		Arrays.sort(result);
			
		return result;
	}

}
