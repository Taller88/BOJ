package com.back.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MeetingRoom {

	static class Meeting{
		int start;
		int end;
		public Meeting(int start, int end) {
			this.start=start;
			this.end=end;
		}
	}
	public static void main(String[] args) throws Exception{
//		11
//		1 4
//		3 5
//		0 6
//		5 7
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		StringTokenizer st;
		ArrayList<Meeting> waiting=new ArrayList<>();
		
		for(int i=0; i<count; i++) {
			st=new StringTokenizer(br.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			waiting.add(new Meeting(start, end));
			
		}
		waiting.sort(new Comparator<Meeting>() {
			@Override
			public int compare(Meeting o1, Meeting o2) {
				if(o1.end==o2.end) {
					return o1.start-o2.start;
				}
				return o1.end-o2.end;
			}
			
		});
		
//		for(int i=0; i<waiting.size(); i++) {
//			System.out.println(waiting.get(i).start+" "+waiting.get(i).end);
//		}
		int time=0;
		int cnt=0;
		int i=0;
		while(!waiting.isEmpty()) {
			Meeting m=waiting.remove(i);
			if(time<=m.start) {
//				System.out.println("**: "+m.start+" "+m.end+" time: "+time);
				time=m.end;
				cnt++;
			}
		}
		System.out.println(cnt);
	
	}

}
