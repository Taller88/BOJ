package com.back.math3;

import java.util.*;

public class Check{
		public static void main(String[]args) throws Exception{
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        long arr[]=new long[a];
	        for(int i=0; i<a; i++) {
	        	arr[i]=sc.nextLong();
	        }
	        String result="";
	        Arrays.sort(arr);
	        for(long i=2; i<=arr[0];i++) {
	            long b=arr[0]%i;
	            boolean check=true;
	            for(int j=1; j<arr.length; j++){
	                 if(b!=arr[j]%i){
	                     check=false;
	                 }
	            }
	            if(check){
	                 result+=i+" ";
	            }
	         }

	        System.out.println(result.trim());
	        }
	        
		
	}
