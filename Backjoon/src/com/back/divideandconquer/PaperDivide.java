package com.back.divideandconquer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PaperDivide {
	static int white=0;
	static int blue=0;
	static int[][] arr;
	public static void main(String[]args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n][n];
		StringTokenizer st;
		for(int i=0; i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<n; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		dividePaper(n,0,0);
		System.out.println(white+"\n"+blue);
		
	}

	public static void dividePaper(int n, int h, int w) {
		
		if(check(n,h,w)) {
			if(arr[h][w]==0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
//		System.out.println("n: "+n+" h:"+h+" w: "+w);
		
		dividePaper(n/2, h, w);
		dividePaper(n/2, h+n/2, w);
		dividePaper(n/2, h, w+n/2);
		dividePaper(n/2, h+n/2, w+n/2);
		
	}

	public static boolean check(int n, int h, int w) {
		int cri=arr[h][w];
		for(int i=h; i<h+n; i++) {
			for(int j=w; j<w+n; j++) {
				if(cri!=arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
