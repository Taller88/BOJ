package com.back.math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Factorization {
	public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int a=Integer.parseInt(br.readLine());
        int b=2;
        while(a>1) {
        	while(a%b==0) {
        		a/=b;
        		bw.write(b+"\n");
        	}
        	b++;
        }
        bw.flush();
	
	}
}
