package com.back.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Sugar {
//18
//4
	
	public static void main(String[] args) throws Exception{
	//5로 깔끔히 나눠지는 경우 , 5a+3b로 나눠지는 경우 , 3으로 나눠지는 경우
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%5==0) {
			System.out.println(num/5);
			return;
		}
		for(int i=num/5; i>0; i--) {
			if((num-5*i)%3==0) {
				System.out.println(i+(num-5*i)/3);
				return;
			}
		}
		if(num%3==0) {
			System.out.println(num/3);
			return;
		}
		System.out.println(-1);
		
	}
	
}
