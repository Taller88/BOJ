package com.back.sort;
import java.io.*;
import java.util.*;

public class Sort2 {
	
		public static void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        int cnt=Integer.parseInt(br.readLine());
	        PriorityQueue<Integer> q=new PriorityQueue<>();
	        for(int i=0; i<cnt; i++){
	            q.add(Integer.parseInt(br.readLine()));
	        }
	        
	        for(int i=0; i<cnt; i++){
	            bw.write(q.poll()+"\n");
	        }
	        bw.flush();
		}



}
