package com.back.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	public static void main(String[]args) throws Exception{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt=Integer.parseInt(br.readLine());
        ArrayList<String> list=new ArrayList<>();
        String[] arr=new String[cnt];
        for(int i=0; i<cnt; i++) {
        	String tmp=br.readLine();
        	list.add(tmp);
        	arr[i]=tmp;
        }
        Arrays.sort(arr,new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		return (String.valueOf(s1.length())).compareTo(String.valueOf(s2.length()));
        	}
		});
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);
        }
        
	}
}
