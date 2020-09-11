package com.back.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;

public class Statics {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[]arr=new int[n];
		int[]cnt=new int[8001];
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		float sum=0;
		int max=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(arr[i]>0) {
				cnt[arr[i]]++;
				max=Math.max(max, cnt[arr[i]]);
			}else {
				cnt[Math.abs(arr[i])+4000]++;
				max=Math.max(max, cnt[Math.abs(arr[i])+4000]);
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0; i<cnt.length; i++) {
			if(max==cnt[i]) {
				if(i>4000) {
					list.add((i-4000)*-1);
				}else {
					list.add(i);
				}
			}
		}
		Collections.sort(list);
		
		float avg=0;
		int middle=0;
		int maxCnt=0;
		int ran=0;
		avg=sum/n;
		middle=arr[n/2];
		if(list.size()>1) {
			maxCnt=list.get(1);
		}else {
			maxCnt=list.get(0);
		}
		ran=arr[n-1]-arr[0];
		
		System.out.println((int)Math.ceil(Math.round(avg)));
		System.out.println(middle);
		System.out.println(maxCnt);
		System.out.println(ran);
		
	}

}
