package com.back.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Coin {
	public static void main(String []args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
//        10 4200
//        1			1
//        5			2
//        10		3
//        50		4
//        100		5
//        500		6
//        1000		7
//        5000		8
//        10000		9
//        50000		10
        int cnt=Integer.parseInt(st.nextToken());
        int payment=Integer.parseInt(st.nextToken());
        int arr[]=new int[cnt];
        int result=0;
        for(int i=0; i<arr.length; i++) {
        	arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=arr.length-1; i>=0; i--) {
        	if(payment==0) {
        		break;
        	}
        	if(payment>=arr[i]) {
        		result+=payment/arr[i];
        		payment=payment%arr[i];
        	}
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
        br.close();
    }


}
