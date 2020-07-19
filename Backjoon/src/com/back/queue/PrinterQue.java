package com.back.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQue {
	static class InputTest implements Comparable<InputTest>{
		int idx;
		int value;
		public InputTest(int i, int v) {
			this.idx=i;
			this.value=v;
		}
		public InputTest() {
		}
		@Override
		public int compareTo(InputTest o) {
			return this.value<=o.value?1:-1;
		}
	}
	
	public static void main(String[] args) throws Exception{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int tc=Integer.parseInt(st.nextToken());
		for(int i=0; i<tc; i++) {
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int idx=Integer.parseInt(st.nextToken());
			InputTest tmp=new InputTest();
			tmp.idx=idx;
			PriorityQueue<InputTest> pq=new PriorityQueue<>();
			Queue<InputTest> q=new LinkedList<>();
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<n;j++) {
				int a=Integer.parseInt(st.nextToken());
				InputTest it=new InputTest(j, a);
				pq.add(it);
				q.add(it);
				if(j==idx) {
					tmp.value=a;
				}
			}
			int cnt=1;
			while(!pq.isEmpty()) {
				InputTest qIt=pq.poll();
				InputTest listIt = null;
				for(int k=0; k<q.size(); k++) {
					listIt=q.poll();
					//System.out.println("idx: "+listIt.idx +" value:"+listIt.value+" k:"+k);
					if(qIt.value==listIt.value) {
						q.remove(k);
						break;
					}else {
						q.remove(k);
						q.add(listIt);					
						}
				}//for
//				System.out.println("idx: "+listIt.idx +" value:"+listIt.value+" cnt:"+cnt);
				
				if(tmp.idx==listIt.idx && tmp.value==listIt.value) {
					System.out.println(cnt);
					break;
				}
				cnt++;	
				
			}//while
		}
		
	}


}
