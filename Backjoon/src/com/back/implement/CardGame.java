package com.back.implement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame {

	public static void main(String[] args) throws Exception{
		int aCnt=0;
		int[] a=new int[10];
		int bCnt=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<10; i++) {
			a[i]=Integer.parseInt(st.nextToken());
		}
		st=new StringTokenizer(br.readLine());
		int b=0;
		for(int i=0; i<10; i++) {
			b=Integer.parseInt(st.nextToken());
			if(a[i]>b) {
				aCnt++;
			}else if(a[i]<b) {
				bCnt++;
			}
		}
		if(aCnt>bCnt) {
			System.out.println("A");
		}else if(aCnt<bCnt) {
			System.out.println("B");
		}else {
			System.out.println("D");
		}
	}

}
