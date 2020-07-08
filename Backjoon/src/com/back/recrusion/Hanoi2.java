package com.back.recrusion;
import java.util.*;
public class Hanoi2 {
	static StringBuilder sb=new StringBuilder();
	static int cnt=0;
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		haoni(num,1,2,3);
		System.out.println(cnt);
		System.out.println(sb);
	}

	public static void haoni(int num, int from, int by, int to) {
		cnt++;
		if(num==1) {
			sb.append(from +" "+to+"\n");
			return;
		}
		haoni(num-1, from, to, by);
		sb.append(from +" "+to+"\n");
		haoni(num-1, by, from, to);
	}
}
