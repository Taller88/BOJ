package com.back.dfsbfs;
import java.util.*;

public class Mirro {
	static int[][] mirro;
	static boolean[][] visited;
	static int result;
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);	
		int height=sc.nextInt();
		int width=sc.nextInt();
		result=width*height;
		mirro=new int[width][height];
		visited=new boolean[width][height];
//		4 6
//		101111
//		101010
//		101011
//		111011
		bfs(height,width);
		
		
	}
	public static void bfs(int height, int width) {
		
		
	}
}
