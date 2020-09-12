package com.back.math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turets {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int r1=Integer.parseInt(st.nextToken());
			
			int x2=Integer.parseInt(st.nextToken());
			int y2=Integer.parseInt(st.nextToken());
			int r2=Integer.parseInt(st.nextToken());
			if(x1==x2 && y1==y2 && r1==r2) {
				System.out.println(-1);
				continue;
			}
			else if(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)>Math.pow(r1+r2, 2) || Math.pow(x1-x2,2)+Math.pow(y1-y2,2)<Math.pow(r1-r2, 2)) {
				System.out.println(0);
				continue;
			}
			
			else if(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)==Math.pow(r1-r2, 2) || Math.pow(x1-x2,2)+Math.pow(y1-y2,2)==Math.pow(r1+r2, 2)) {
				System.out.println(1);
				continue;
			}
			else {
				System.out.println(2);
			}
		}
	}

}
