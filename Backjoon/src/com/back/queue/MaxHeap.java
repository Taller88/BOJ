package com.back.queue;
import java.util.*;
import java.io.*;
public class MaxHeap {
	   public static void main(String[]args) throws Exception{
	        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        int input=Integer.parseInt(br.readLine());
	        for(int i=0; i<input; i++) {
	        	int tmp=Integer.parseInt(br.readLine());
	        	if(tmp==0) {
	        		if(pq.isEmpty()) {
	        			bw.write("0\n");
	        		}else {
	        			bw.write(pq.poll()+"\n");
	        		}
	        	}else {
	        		pq.offer(tmp);
	        	}
	        }
	        bw.flush();
	        
	        
	        
	   }
}
