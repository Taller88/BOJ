package com.back.basic;
import java.util.*;
public class Yut {
	//0 1 0 1
	//1 1 1 0
	//0 0 1 1

	
	    public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        StringBuilder sb=new StringBuilder();
	        for(int z=0; z<3; z++){
	            int cnt=0;
	            for(int i=0; i<4; i++){
	                int tmp=sc.nextInt();
	                if(tmp==0){
	                	cnt++;
	                }
	            }
	            if(cnt==0){
	                sb.append("E\n");
	            }else if(cnt==1){
	                sb.append("A\n");
	            }else if(cnt==2){
	                sb.append("B\n");
	            }else if(cnt==3){
	                sb.append("C\n");
	            }else if(cnt==4){
	                sb.append("D\n");
	            }
	            
	        }
	        System.out.println(sb.toString().trim());
	    }
	
}
