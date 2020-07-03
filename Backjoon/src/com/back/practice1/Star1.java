package com.back.practice1;
import java.util.*;

public class Star1 {
	    public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);
	        int cnt=sc.nextInt();
	        int a=1;
	        boolean tmp=true;
	       
	        while(a>0){
	            
	            for(int i=0; i<a; i++){
	                System.out.print("*");
	            }
	                System.out.println();
	            
	            if(a==cnt){
	                tmp=false;
	            }
	            if(tmp){
	                a++;
	            }else{
	                a--;
	            }
	        }
	        
	    }
}
