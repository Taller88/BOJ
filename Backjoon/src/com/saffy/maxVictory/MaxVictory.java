package com.saffy.maxVictory;
import java.util.*;
public class MaxVictory {
	public static int solution(int[] first, int[] sec) {
		int count=0;
		if(first[0]<sec[0]) {
			sec[sec.length-1]=0;
			first[0]=0;
				
		}
		Arrays.sort(first);
		Arrays.sort(sec);
		for(int i=0; i<first.length; i++) {
			for(int j=0; j<sec.length; j++) {
				if(first[i]>sec[j] && first[i]!=0 && sec[j]!=0) {
					count++;
					first[i]=0;
					sec[j]=0;
					break;
					
				}
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		int[] first= {50,80,100,150,250}; 
		int[] sec= {150,300,120,80,200};
		System.out.println(solution(first, sec));
	}

}
