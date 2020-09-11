package com.back.string;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int z=0; z<3; z++) {
		String in=sc.nextLine();
		int result=0;
		for(int i=0; i<in.length()-1; i++) {
			char tmp=in.charAt(i);
			int cnt=1;
			
//			System.out.println("i: "+i);
			for(int j=i+1; j<in.length(); j++) {
				System.out.println(tmp+" "+in.charAt(j));
				if(tmp==in.charAt(j)) {
					cnt++;
				}else if(tmp!=in.charAt(j)){
//					System.out.println(j);
					i=j-1;
//					System.out.println(in.charAt(i));
					
					result=Math.max(result, cnt);
					break;
				}
			}
		}
//		System.out.println(result);
	}
	}
	
}
