package com.back.study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<num; i++) {
//			arr[i]=sc.nextInt();
			pq.add(sc.nextInt());
		}
//		Arrays.sort(arr);
		int size=pq.size();
		for(int i=0; i<size; i++) {
			System.out.println(pq.poll());
		}
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
	}

}
