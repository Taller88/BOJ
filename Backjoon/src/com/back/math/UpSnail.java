package com.back.math;
import java.util.*;

public class UpSnail {

	  public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
	        long a=sc.nextLong();
	        long b=sc.nextLong();
	        long v=sc.nextLong();
          long cur=0;
          long cnt=1;
	        while(cur<v){
              cur+=a;
              if(cnt>=v){
                  break;
              }
              cur-=b;
              cnt++;
          }
          System.out.println(cnt);
	        
	        
	    }
	
}
