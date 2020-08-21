package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BasketBall {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0; i<n; i++) {
			String name=br.readLine();
			map.put(name.charAt(0), map.getOrDefault(name.charAt(0), 0)+1);
		}
		ArrayList<Character> list=new ArrayList<>();
		for(Character c: map.keySet()) {
//			System.out.println(map.get(c));
			if(map.get(c)>=5) {
				list.add(c);
			}
		}
		if(list.isEmpty()) {
			System.out.println("PREDAJA");
			return;
		}else {
			Collections.sort(list);
			String tmp="";
			for(int i=0; i<list.size(); i++) {
				tmp+=list.get(i);
			}
			System.out.println(tmp);
		}
		
	}

}
