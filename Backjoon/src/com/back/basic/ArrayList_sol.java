package com.back.basic;
import java.util.*;
import java.io.*;
public class ArrayList_sol {

	    public static void main(String[]args) throws Exception{
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        int a=Integer.parseInt(br.readLine());
	        for(int j=0; j<a; j++){
	            String tmp=br.readLine();
	            int c=0;
	            ArrayList<Integer> list=new ArrayList<Integer>();
	            for(int i=0; i<tmp.length(); i++){
	                if(tmp.charAt(i)=='O'){
	                    list.add(1);
	                    bw.write(list.size()+"+");
	                    c+=list.size();
	                }else if(tmp.charAt(i)=='X'){
	                    list.clear();
	                }
	            }
	            bw.write(c+"\n");
	        }
	        bw.flush();
	    }
	
}
