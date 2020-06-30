package com.back.basic;
import java.util.*;
import java.io.*;
public class BufferEx{
    public static void main(String []args) throws Exception{
      	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        StringTokenizer st;
	        int t=Integer.parseInt(br.readLine());
	        for(int z=0; z<t; z++){
	            st=new StringTokenizer(br.readLine());
	            int a=Integer.parseInt(st.nextToken());
	            int [] arr=new int[a];
	            int sum=0;
	            for(int i=0; i<a; i++){
	                arr[i]=Integer.parseInt(st.nextToken());
	                sum+=arr[i];
	            }
	            double avg=sum/(double)(a);
	            int cnt=0;
	            for(int i=0; i<arr.length; i++){
	                if(arr[i]>avg){
	                    cnt++;
	                }
	            }
	            double result=cnt/(double)(a);
	            bw.write(String.format("%.3f",result*100)+"%\n");
	        }
	        bw.flush();
	    }
}