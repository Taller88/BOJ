package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class LeavingPeople {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		HashSet<String> result=new HashSet<>();
		for(int i=0; i<num; i++) {
			String tmp=br.readLine();
			String name=tmp.substring(0, tmp.indexOf(" "));
			//System.out.println("name:"+name);
			if(tmp.contains("enter")) {
				result.add(name);
			}else {
				result.remove(name);
			}
		}
		
		String[] arr = result.toArray(new String[result.size()]);
        Arrays.sort(arr);   //오름차순 정렬
         
        //내림차순으로 출력
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }


	}

}
