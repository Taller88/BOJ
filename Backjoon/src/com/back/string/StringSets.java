package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StringSets {

	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String arr[]=br.readLine().split("");
		ArrayList<boolean[]> list=new ArrayList<>();
		list.add(new boolean[10]);
		
		int cnt=1;
		
		for(int i=0; i<arr.length; i++) {
			boolean check=false;
			
			for(int j=0; j<list.size(); j++) {
				if(Integer.parseInt(arr[i])==6) {
					if(!list.get(j)[Integer.parseInt(arr[i])]) {
						list.get(j)[Integer.parseInt(arr[i])]=true;
						check=true;
						break;
					}else if(!list.get(j)[9]){
						list.get(j)[9]=true;
						check=true;
						break;
					}
				}else if(Integer.parseInt(arr[i])==9) {
					if(!list.get(j)[Integer.parseInt(arr[i])]) {
						list.get(j)[Integer.parseInt(arr[i])]=true;
						check=true;
						break;
					}else if(!list.get(j)[6]){
						list.get(j)[6]=true;
						check=true;
						break;
					}
				}else {
					if(!list.get(j)[Integer.parseInt(arr[i])]) {
						list.get(j)[Integer.parseInt(arr[i])]=true;
						System.out.println(Integer.parseInt(arr[i]));
						check=true;
						break;
					}
				}//else 6/9
				
				
			}
			
			if(!check) {
				System.out.println("?");
				list.add(new boolean[10]);
				list.get(list.size()-1)[Integer.parseInt(arr[i])]=true;
				cnt++;
			}
			
			
		}
		System.out.println(cnt);
	}

}
