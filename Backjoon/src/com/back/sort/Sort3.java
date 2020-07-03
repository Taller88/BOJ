package com.back.sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Sort3 {
	    public static void main(String[]args) throws Exception{
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	           long a=Long.parseLong(br.readLine());
	           PriorityQueue<Integer> q=new PriorityQueue<>();
		        for(long i=0; i<a; i++){
		            q.add(Integer.parseInt(br.readLine()));
		        }
		        while(!q.isEmpty()) {
		        bw.write(q.poll()+"\n");
		        }

		        bw.flush();
			}
	    
	
}
