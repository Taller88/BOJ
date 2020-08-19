package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChessHorse {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[][]arr=new String[8][8];
		for(int i=0; i<8; i++) {
			arr[i]=br.readLine().split("");
		}
		int cnt=0;
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i%2==0) {
					if(j%2==0 && arr[i][j].equals("F")) {
						cnt++;	
					}
				}else {
					if(j%2==1 && arr[i][j].equals("F")) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
		
	}

}
