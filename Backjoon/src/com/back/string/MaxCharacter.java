package com.back.string;
import java.io.*;
import java.util.*;

public class MaxCharacter {
	
	    public static void main(String[]args) throws Exception{
	        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		        String tmp=br.readLine().toUpperCase();
		        
		        HashMap<Character, Integer> map=new HashMap<>();
		        for(int i=0; i<tmp.length(); i++){
		            map.put(tmp.charAt(i), map.getOrDefault(tmp.charAt(i),0)+1);
		        }
		        int max=0;
		        String maxS="";
		        for(Character c: map.keySet()){
		        	if(max<map.get(c)){
		                max=map.get(c);
		                maxS=c+"";
		            }
		        }
		        int cnt=0;
		        for(Character c: map.keySet()) {
		        	if(map.get(c)==max) {
		        		cnt++;
		        	}
		        	if(cnt==2) {
		        		maxS="?";
		        		break;
		        	}
		        	
		        }
	            bw.write(maxS);
		        bw.flush();

	    }
	
}
