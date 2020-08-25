package com.back.study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctSort{
	    
	public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
	        int num=sc.nextInt();
	        HashSet<Integer> set=new HashSet<>();
	        for(int i=0; i<num; i++){
	            set.add(sc.nextInt());
	        }
	        String tmp="";
	        int[] arr=new int[set.size()];
	        int idx=0;
	        for(int a: set){
	        	arr[idx]=a;
	        	idx++;
	        }
	        Arrays.sort(arr);
	        for(int i=0; i<arr.length; i++) {
	        	tmp+=arr[i]+" ";
	        }
	        System.out.println(tmp.trim());
	}
	
}
