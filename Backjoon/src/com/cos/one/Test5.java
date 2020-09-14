package com.cos.one;

import java.util.ArrayList;
import java.util.HashMap;
public class Test5 {

	public static void main(String[] args) {
		int N=5;
		int[]votes= {1,3,2,3,2};
		ArrayList<Integer> list=solution(N,votes);
		for(int a: list) {
			System.out.println(a);
		}
	}

	private static ArrayList<Integer> solution(int n, int[] votes) {
		ArrayList<Integer> list=new ArrayList<>();
		HashMap<Integer, Integer> map=new HashMap<>();
		int max=0;
		for(int i=0; i<votes.length; i++) {
			map.put(votes[i], map.getOrDefault(votes[i], 0)+1);
			max=Math.max(max, map.get(votes[i]));
		}
		for(int key:map.keySet()) {
			if(max==map.get(key)) {
				list.add(key);
			}
		}
		return list;
	}

}
