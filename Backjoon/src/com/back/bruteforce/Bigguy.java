package com.back.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bigguy {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int input=Integer.parseInt(br.readLine());
        int arr[][]=new int[input][2];
        for(int i=0; i<input; i++) {
        	st=new StringTokenizer(br.readLine());
        	int a=Integer.parseInt(st.nextToken());
        	int b=Integer.parseInt(st.nextToken());
        	arr[i][0]=a;
        	arr[i][1]=b;
        }
        String result="";
        for(int i=0; i<input; i++) {
            int tmp=1;
        	for(int j=0; j<input; j++) {
            	if(i==j) {
            		continue;
            	}
            	if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
            		tmp++;
            	}
            }
        	result+=tmp+" ";
        } 	
        System.out.println(result.trim());
	}

}
