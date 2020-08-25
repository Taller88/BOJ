package com.back.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BaseBall {
	public static void main(String[]args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		4
//		123 1 1
//		356 1 0
//		327 2 0
//		489 0 1
		int num=Integer.parseInt(br.readLine());
		ArrayList<String> list=new ArrayList<>();
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				for(int z=1; z<10; z++) {
					if(i!=j && j!=z && i!=z) {
						list.add(String.valueOf(i*100+j*10+z));
					}
				}
			}
		}
		StringTokenizer st;
		for(int i=0; i<num; i++) {
			st=new StringTokenizer(br.readLine());
			int prob=Integer.parseInt(st.nextToken());
			int str=Integer.parseInt(st.nextToken());
			int ball=Integer.parseInt(st.nextToken());
			int size=list.size();
			for(int j=0; j<size; j++) {
				String a=list.get(j);
				String listS=String.valueOf(a);
				String probS=String.valueOf(prob);
				if(!check(listS, probS, str,ball)) {
					list.remove(a);
					size--;
			        j--;
				}
			}
		}
		for(String t: list) {
			System.out.println(t);
		}
		System.out.println(list.size());
	}

	public static boolean check(String listS, String probS, int str, int ball) {
		String[]arr1=listS.split("");
		String[]arr2=probS.split("");
		int strCnt=0;
		int ballCnt=0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i].equals(arr1[i])) {
				strCnt++;
			}else if(listS.contains(arr2[i])) {
				ballCnt++;
			}
		}
		if(strCnt!=str || ballCnt!=ball) {
			return false;
		}
		//System.out.println("check: "+listS+" "+probS+" "+strCnt+" "+ball);
		
		return true;
	}

}
