package com.back.math2;

import java.io.*;
import java.util.*;

public class PrimeNum{
    public static int prime(int a,int b){
    	if(b==1) {
    		return a;
    	}else if(a%b==0) {
    		return -1;
    	}else {
    		return prime(a,b-1);
    	}
    }
    public static void main(String []args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
            int cnt=0;
        int total=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<total; i++){
            int tmp=Integer.parseInt(st.nextToken());
        	if(tmp==1) {
        		continue;
        	}
            int a=prime(tmp,tmp-1);
        	if(a!=-1){
                cnt++;
            }
        }
        bw.write(cnt+"");
        bw.flush();
        
    }
}
