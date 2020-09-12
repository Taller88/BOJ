package com.back.math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GoldBah {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean[]isPrime=new boolean[100001];
		for(int i=2; i<isPrime.length; i++) {
			isPrime[i]=true;
		}
		for(int i=2; i<isPrime.length; i++) {
			for(int j=i*2; j<isPrime.length; j+=i) {
				if(!isPrime[j]) {
					continue;
				}
				isPrime[j]=false;
			}
		}
		int n=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		for(int z=0; z<n; z++) {
			int min=Integer.MAX_VALUE;
			String result="";
			int num=Integer.parseInt(br.readLine());
			
			for(int i=2; i<num; i++) {
				if(isPrime[i]&& isPrime[num-i]) {
					if(Math.abs((num-i)-i)<min) {
						min=Math.abs((num-i)-i);
						if(i<num-i) {
							result=i+" "+(num-i);
						}else {
							result=(num-i)+" "+i;
						}
					}
				}
			}
			sb.append(result+"\n");
		
		}
		System.out.println(sb.toString().trim());
	}

	

}
