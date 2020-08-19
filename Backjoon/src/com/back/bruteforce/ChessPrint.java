package com.back.bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessPrint {
	static String[][]arr;
	static int answer=Integer.MAX_VALUE;
	public static void check(String[][]arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static int findMin(int h, int w) {
		int fCnt=0;
		//시작이 w
		for(int i=h; i<h+8; i++) {
			for(int j=w; j<w+8; j++) {
				if(i%2==0) {
					if(j%2==0 && !arr[i][j].equals("W")) {
						fCnt++;
					}else if(j%2==1 && !arr[i][j].equals("B")) {
						fCnt++;
					}
				}else {
					if(j%2==1 && !arr[i][j].equals("W")) {
						fCnt++;
					}else if(j%2==0 && !arr[i][j].equals("B")) {
						fCnt++;
					}
				}
			}
		}
		//시작이 B
		int sCnt=0;
		for(int i=h; i<h+8; i++) {
			for(int j=w; j<w+8; j++) {
				if(i%2==0) {
					if(j%2==1 && !arr[i][j].equals("W")) {
						sCnt++;
					}else if(j%2==0 && !arr[i][j].equals("B")) {
						sCnt++;
					}
				}else {
					if(j%2==0 && !arr[i][j].equals("W")) {
						sCnt++;
					}else if(j%2==1 && !arr[i][j].equals("B")) {
						sCnt++;
					}
				}
			}
		}
		
		return Math.min(fCnt, sCnt);
	}
	
	public static void main(String[]args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int h=Integer.parseInt(st.nextToken());
		int w=Integer.parseInt(st.nextToken());
		arr=new String[h][w];
		for(int i=0; i<h; i++) {
			arr[i]=br.readLine().split("");
		}
		int cnt=0;
		for(int i=0; i<=h-8; i++) {
			for(int j=0; j<=w-8; j++) {
				answer=Math.min(answer, findMin(i, j));
				cnt++;
			}
		}
//		System.out.println(cnt);
//		check(arr);
		System.out.println(answer);
		

	}
}
