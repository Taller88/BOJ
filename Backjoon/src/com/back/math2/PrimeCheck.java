package com.back.math2;
import java.io.*;
import java.util.StringTokenizer;

public class PrimeCheck {


		public static void main(String []args) throws Exception{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        int f=Integer.parseInt(st.nextToken());
	        int s=Integer.parseInt(st.nextToken());
	        for(int i=f;i<=s;i++) {
	        	if(i>10 && (i%2==0||i%3==0 ||i%5==0 ||i%7==0)) {
	        		System.out.println("continue: "+i);
	        		continue;
	        	}
	        	if(prime(i,i-1)) {
	                bw.write(i+"\n");
	            }
	        }
	        bw.flush();
	        bw.close();
	        br.close();
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
