package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeNumAndPalendrum {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num==1) {
			num++;
		}
		while(true) {
//			System.out.println(num);
			boolean checkPrime=true;
			for(int i=2; i*i<=num; i++) {
				if(num%i==0) {
					checkPrime=false;
					break;
				}
			}
			if(!checkPrime) {
				num++;
				continue;
			}
			String nString=String.valueOf(num);
			String tmp="";
			for(int i=nString.length()-1; i>=0 ; i--) {
				tmp+=nString.charAt(i);
			}
			if(tmp.equals(nString)) {
				num=Integer.parseInt(nString);
				break;
			}
			num++;
		}
		System.out.println(num);
	}

}
