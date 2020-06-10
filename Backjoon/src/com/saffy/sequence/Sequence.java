package com.saffy.sequence;
import java.util.*;
public class Sequence {

	public static int solution(int[] seq) {
		ArrayList<String> list=new ArrayList<>();
		for(int i=0; i<seq.length; i++) {
			list.add(String.valueOf(seq[i]));
		}

		for(int i=0; i<seq.length-1; i++) {
			String tmp="";
			for(int j=i; j<seq.length; j++) {
				if(seq[i]==seq[j]) {
					break;
				}else {
	
				}
				
			}
		}
		return list.size();
	}
	
	public static void main(String[] args) {
		int[]seq= {4,4,4,16,16,13};
		System.out.println(solution(seq));
	}

}
