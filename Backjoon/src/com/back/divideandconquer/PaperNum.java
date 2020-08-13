package com.back.divideandconquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PaperNum {
	static int[][]arr;
	static int minus=0;
	static int zero=0;
	static int one=0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dividePaper(n,0,0);
		System.out.println(minus+"\n"+zero+"\n"+one);
		
//		9
//		0 0 0 1 1 1 -1 -1 -1
//		0 0 0 1 1 1 -1 -1 -1
//		0 0 0 1 1 1 -1 -1 -1
//		1 1 1 0 0 0 0 0 0
//		1 1 1 0 0 0 0 0 0
//		1 1 1 0 0 0 0 0 0
//		0 1 -1 0 1 -1 0 1 -1
//		0 -1 1 0 1 -1 0 1 -1
//		0 1 -1 1 0 -1 0 1 -1
		
	}
	public static void dividePaper(int n, int h, int w) {
		
		if(check(n,h,w)) {
			
			
			int tmp=arr[h][w];
			if(tmp==-1) {
				minus++;
			}else if(tmp==0) {
				zero++;
			}else {
				one++;
			}
			return;
		}
		
		dividePaper(n/3, h, w);
		dividePaper(n/3, h+n/3, w);
		dividePaper(n/3, h+n/3+n/3, w);
		dividePaper(n/3, h, w+n/3);
		dividePaper(n/3, h, w+n/3+n/3);
		dividePaper(n/3, h+n/3, w+n/3);
		dividePaper(n/3, h+n/3, w+n/3+n/3);
		dividePaper(n/3, h+n/3+n/3, w+n/3);
		dividePaper(n/3, h+n/3+n/3, w+n/3+n/3);
	
		
	}
	public static boolean check(int n, int h, int w) {
		
		int cri=arr[h][w];
		for(int i=h; i<h+n; i++) {
			for(int j=w; j<w+n; j++) {
//				if(n==3 && h==0 && w==0) {
//					System.out.println(i+":"+j+" "+arr[i][j]);
//				}
				
				if(cri!=arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
