package com.back.math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class UpSnail {

	  public static void main(String[]args) throws Exception{
		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      String[] arr=br.readLine().split(" ");
	      int a=Integer.parseInt(arr[0]);
	      int b=Integer.parseInt(arr[1]);
	      int v=Integer.parseInt(arr[2]);
	      int c=0;
	      
	      int day = (v - b) / (a - b);
	        
			// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
			if ((v - b) % (a - b) != 0) {
				day++;
			}
			System.out.println(day);
	      
	    }
	
}
