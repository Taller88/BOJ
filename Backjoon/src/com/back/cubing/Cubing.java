package com.back.cubing;

import java.io.*;
import java.util.*;
import java.util.logging.Logger;


public class Cubing {
	static char[][][] cube=new char[6][3][3];
	public static char[][][] init() {
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				cube[0][i][j]='w';
				cube[1][i][j]='r';
				cube[2][i][j]='y';
				cube[3][i][j]='o';
				cube[4][i][j]='g';
				cube[5][i][j]='b';
					}
		}
		
		return cube;
	}
	public static void printCube(){
		String up="";
		String down="";
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				up+=cube[4][i][j];
				down+=cube[3][i][j];
				
			}
			up+="\n";
			down+="\n";
			
		}
		
		System.out.println(up);
		System.out.println(down);
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(tk.nextToken());
		System.out.println("This is 테스트케이스 개수:"+n);
		for(int i = 0; i < n; i++) {
			tk = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(tk.nextToken());
			System.out.println("This is 큐브 돌린 개수:"+m);

			tk = new StringTokenizer(br.readLine());
			init();
			for(int j = 0; j < m; j++) {
				String s = tk.nextToken();
				System.out.println("돌린 위치/돌린 방향:"+s);
				turn(s);
			}
		}
		printCube();
		
	}
	private static void turn(String s) {
		char location=s.charAt(0);
		char direction=s.charAt(1);
		
		if(location=='U') {//0
			if(direction=='+') {//시계
				
				for(int i=0; i<3; i++) {//주변 큐브
					char temp=cube[1][0][i];

					cube[1][0][i]=cube[5][2-i][0];
					cube[5][i][0]=cube[3][2][2-i];
					cube[3][2][2-i]=cube[4][i][2];
					cube[4][i][2]=temp;
					
				}
				cube[0]=face(cube[0],direction);
			}else {//반시계
				
				for(int i=0; i<3; i++) {//주변 큐브
					char temp=cube[3][2][i];
					
					cube[3][2][i]=cube[5][i][0];
					cube[1][0][i]=cube[4][i][2];
					cube[5][i][0]=cube[1][2][i];
					cube[4][i][0]=temp;
					
				}
				cube[0]=face(cube[0],direction);
				
			}
			
		}else if(location=='B') {//3
			if(direction=='+') {//시계
				
				for(int i=0; i<3; i++) {//주변 큐브
					char temp=cube[1][0][i];

					cube[1][0][i]=cube[5][2-i][0];
					cube[5][i][0]=cube[3][2][2-i];
					cube[3][2][2-i]=cube[4][i][2];
					cube[4][i][2]=temp;
					
				}
				cube[0]=face(cube[0],direction);
			}else {//반시계
				
				for(int i=0; i<3; i++) {//주변 큐브
					char temp=cube[3][2][i];
					
					cube[3][2][i]=cube[5][i][0];
					cube[1][0][i]=cube[4][i][2];
					cube[5][i][0]=cube[1][2][i];
					cube[4][i][0]=temp;
					
				}
				cube[0]=face(cube[0],direction);
				
			}			
		}else if(location=='F') {//1
			
		}else if(location=='L') {//4
			
		}else if(location=='R') {//5
			
		}else if(location=='D') {//2
			
		}
	}
	private static char[][] face(char[][] input, char direction) {
		char[][] nFace =new char[3][3];
		if(direction=='+') {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					nFace[j][2-i]=input[i][j];
				}
			}
		}else {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					nFace[2-j][i]=input[i][j];
				}
			}
				
		}
		
		return nFace;
	}

}
