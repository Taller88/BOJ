package com.back.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Score8 {
	static class Score{
		int score;
		int idx;
		public Score(int score, int idx) {
			this.score=score;
			this.idx=idx;
		}
	}
	public static void main(String[] args) {
		ArrayList<Score> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int cnt=1;
		for(int i=0; i<8; i++) {
			list.add(new Score(sc.nextInt(), cnt++));
		}
		list.sort(new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				return o1.score-o2.score;
			}});
		int arr[]=new int[list.size()-3];
		int idx=0;
		int sum=0;
		for(int i=3; i<list.size(); i++) {
			sum+=list.get(i).score;
			arr[idx]=list.get(i).idx;
			idx++;
		}
		Arrays.sort(arr);
		System.out.println(sum);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
