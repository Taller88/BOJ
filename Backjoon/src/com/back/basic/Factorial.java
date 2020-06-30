package com.back.basic;
import java.util.*;
import java.io.*;
public class Factorial{
    public static long factorial(long a){
        if(a==1){
            return 1;
        }
        return a*factorial(a-1);
    }
    public static void main(String[]args) throws Exception{
    	Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		System.out.println(factorial(a));		
	      
    }
}