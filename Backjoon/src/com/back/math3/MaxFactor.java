package com.back.math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaxFactor {
	public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int tmp=0;
        if(a>b) {
        	tmp=b;
        	b=a;
        	a=tmp;
        }
        int max=1;
        for(int i=2; i<=b; i++) {
        	while(a%i==0 && b%i==0) {
        		a/=i;
        		b/=i;
        		max*=i;
        	}
        }
        bw.write(max+"\n"+max*a*b);
        bw.flush();
	}
}
