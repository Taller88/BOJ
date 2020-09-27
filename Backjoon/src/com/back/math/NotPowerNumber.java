package com.back.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NotPowerNumber {

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		long min=Long.parseLong(st.nextToken());
		long max=Long.parseLong(st.nextToken());
		boolean[] check=new boolean[(int)(max-min+1)];
		for(long i=2; i*i<=max; i++) {
			long power=i*i;
			long tmp=min%power==0?min/power:min/power+1;
			for(long j=tmp; j*power<max; j++) {
				check[(int)(j*power-min)]=true;
			}
		}
		int answer=0;
		for(int i=0; i<max-min; i++) {
			if(!check[i]) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
