package com.back.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class GoldBah {
	public static boolean primeNum(int n, int b) {
		if(n==1) {
			return false;
		}
		if(n>10 &&(n%2==0||n%3==0||n%5==0||n%7==0)) {
			return false;
		}
		if(b==1){
			return true;
		}
		if(n%b==0) {
			return false;
		}
		return primeNum(n, b-1);
	}
	public static void main(String []args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int a=Integer.parseInt(br.readLine());
        for(int i=0; i<a; i++) {
        	int t=Integer.parseInt(br.readLine());
        	ArrayList<Integer> list=new ArrayList<>();
        	for(int j=2; j<t; j++) {
        		if(primeNum(j, j-1)) {
            		list.add(j);
        		}
        	}
        	int min=99999;
        	String result="";
        	for(int j=0; j<list.size(); j++) {
        		int tmp=list.get(j);
        		for(int z=j; z<list.size(); z++) {
        			int p=list.get(z);
        			if(tmp+p==t) {
        					result=tmp+" "+p;
        			}
        		}
        	}
			bw.write(result+"\n");
        }
	
        bw.flush();
	}
}
