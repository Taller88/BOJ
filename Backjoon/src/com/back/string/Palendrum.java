package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Palendrum {

	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    StringBuilder sb=new StringBuilder();
	    while(true){
	        String num=sc.nextLine();
	        if(num.equals("0")){
	            break;
	        }
	        String tmp="";
	        for(int i=num.length()-1; i>=0; i--){
	            tmp+=num.charAt(i);
	        }
	        if(tmp.equals(num)){
	            sb.append("yes\n");
	        }else{
	            sb.append("no\n");
	        }
	    }
	    System.out.println(sb.toString().trim());
	}

}
