package com.back.math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrimeSum {

	public static void main(String []args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int f=Integer.parseInt(br.readLine());
        int s=Integer.parseInt(br.readLine());
        int min=99999;
        int sum=0;
        for(int i=f;i<=s;i++) {
        	if(i>10 && (i%2==0||i%3==0 ||i%5==0 ||i%7==0)) {
        		continue;
        	}
        	if(prime(i,i-1)) {
        			sum+=i;
        		if(min>i) {
        			min=i;
        		}
        	}
        }
        if(sum==0) {
            bw.write("-1");
        }else {
            bw.write(sum+"\n");
            bw.write(min+"");
        }
        bw.flush();
        
    }

	public static boolean prime(int a,int b){
			if(a==1) {
				return false;
			}else if(b==1) {
	    		return true;
	    	}else if(a%b==0) {
	    		return false;
	    	}else {
	    		return prime(a,b-1);
	    	}
	    }


}
