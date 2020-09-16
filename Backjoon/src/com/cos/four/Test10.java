package com.cos.four;

import java.util.ArrayList;
import java.util.Arrays;

public class Test10 {

	public static int solution(int a, int b) {
		int cnt=0;
		boolean[] prime=new boolean[b+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		
		for(int i=2; i<prime.length; i++) {
			for(int j=i+i ; j<prime.length; j+=i) {
				if(!prime[j]) {
					continue;
				}
				prime[j]=false;
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0; i<prime.length; i++) {
			if(prime[i]) {
				list.add(i);
			}
		}
		
		for(int e: list) {
			System.out.println("소수: "+e);
			if(Math.pow(e, 2)>=a && b>=Math.pow(e, 2)) {
				System.out.println("제곱: "+Math.pow(e, 2));
				cnt++;
			}
			if(Math.pow(e, 3)>=a && b>=Math.pow(e, 3)) {
				System.out.println("세제곱: "+Math.pow(e, 3));
				cnt++;
			}
			
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println(solution(6,30));
	}

}
