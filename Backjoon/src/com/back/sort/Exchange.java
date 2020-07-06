package com.back.sort;

import java.util.Scanner;

public class Exchange {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int a=sc.nextInt();
		int[]arr=new int[input.length()];
		for(int i=0; i<input.length(); i++) {
			arr[i]=Integer.parseInt(input.charAt(i)+"");
		}
		int result=Integer.parseInt(input);
		int b=0;
		for(int i=0; i<arr.length; i++) {
			if(b==a) {
				break;
			}
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
					continue;
				}
				if(arr[i]<arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			String c="";
			for(int j=0; j<arr.length; i++) {
				c+=arr[j]+"";
			}
			if(Integer.parseInt(c)!=result) {
				b++;
				result=Integer.parseInt(c);
			}
			
		}
		sc.close();
		System.out.println(result);
	}
}
