package com.back.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class TreeP {
	
	static class Node {
		int parent;
	    int child;
	 public Node(int p, int c) {
		 this.parent=p;
		 this.child=c;
	}   
	 
	}
	    
	public static void main(String[]args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int z=Integer.parseInt(br.readLine());
        ArrayList<Node> list=new ArrayList<>();
        for(int i=0; i<z-1; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            Node n=new Node(a, b);
            list.add(n);
        }
        
        for(int q=2; q<=z; q++) {
        	for(int i=0; i<list.size(); i++) {
            	if(list.get(i).parent==q) {
            		bw.write(list.get(i).child+"\n");
            		list.remove(i);
            	}
        	}
        }
	bw.flush();
	}
}
