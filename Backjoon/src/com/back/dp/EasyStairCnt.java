package com.back.dp;

import java.util.Scanner;

public class EasyStairCnt {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		
		long[][]dp=new long[100][9];
		for(int i=0; i<9; i++) {
			dp[0][i]=1;
			if(i==8) {
				dp[1][8]=1;
			}else {
				dp[1][i]=2;
			}
		}
		 if(num>2) {

			for(int i=2; i<num; i++) {
					for(int j=0; j<9; j++) {
						if(j==0) {
							dp[i][j]=(dp[i-2][j]+dp[i-1][j+1])%1000000000;
						}else if(j==8){
							dp[i][j]=(dp[i-1][j-1])%1000000000;
						}else {
							dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
						}
					}
				
			}
		 }
		long cnt=0;
		for(int i=0; i<9; i++) {
			cnt+=dp[num-1][i];
		}
		System.out.println(String.valueOf(cnt%1000000000));
		
	}

}
