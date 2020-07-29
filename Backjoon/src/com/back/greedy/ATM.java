package com.back.greedy;
import java.util.*;

public class ATM {
	//5
	//3 1 4 3 2
	    public static void main(String[]args) {
	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int[]arr=new int[a];
	        for(int i=0; i<a; i++){
	            arr[i]=sc.nextInt();
	        }
	        Arrays.sort(arr);
	        int time=0;
	        for(int i=0; i<arr.length; i++){
	            time+=arr[i];
	            arr[i]=time;
	        }
	        int sum=0;
	        for(int i=0; i<arr.length; i++){
	            sum+=arr[i];
	        }
	        System.out.println(sum);
	    }
}

