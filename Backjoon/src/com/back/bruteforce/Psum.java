package com.back.bruteforce;
import java.util.*;
public class Psum {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1; i<=a; i++) {
			if(i==a) {
				System.out.println(0);
				break;
			}
			String tmp=String.valueOf(i);
			int result=i;
			for(int j=0; j<tmp.length(); j++) {
				result+=Integer.parseInt(String.valueOf(tmp.charAt(j)+""));
			}
			if(result==a) {
				System.out.println(i);
				break;
			}
		}
	}
}
