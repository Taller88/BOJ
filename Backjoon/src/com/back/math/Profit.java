package com.back.math;
import java.util.*;
import java.io.*;

public class Profit {
	
	   public static void main(String[]args) throws Exception{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st=new StringTokenizer(br.readLine());
	        long fixPay=Long.parseLong(st.nextToken());
	        long proPay=Long.parseLong(st.nextToken());
	        long sell=Long.parseLong(st.nextToken());
		    long cnt=0;
		    if(fixPay>0 && sell<=proPay) {
		    	cnt=-1;
		    }else if(fixPay==0){
		    	cnt=0;
		    }else {
   		    if(fixPay%(sell-proPay)==0) {
	    		    cnt=fixPay/(sell-proPay)+1;
   		    }else {
   		    	cnt=fixPay/(sell-proPay);
   		    }
		    	
		    }
	        bw.write(cnt+"");
		    bw.flush();
		    }
	}