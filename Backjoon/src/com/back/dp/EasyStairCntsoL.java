package com.back.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EasyStairCntsoL {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        long[][] stairArray = new long[100][9]; // 최대 100행까지 생길 수 있음
        long result = 0;
        
        for(int i=0; i<9; i++) {
            stairArray[0][i] = 1; // 1행일 경우, 1~9까지 계단 수는 각각 1개다.
            
            /* 2자리수 배열 */
            if(i==8) { // 9에 해당하는 계단수(0부터 시작하기 때문에 8이다)
                stairArray[1][i] = 1; 
            }else {
                stairArray[1][i] = 2; // 9를 제외하고 2자리 수 계단 수는 2개씩있다.
            }
        }
        
        if(n>2) {
            for(int i=2; i<n; i++) { // 3행부터 즉, 3자리수부터 시작하는 이유는 맨 앞 1이 나올 경우, 2번째 전 행의 값을 활용하기 위해서
                
                for(int j=0; j<9; j++) {
                    
                    if(j==0) {
                        stairArray[i][j] = (stairArray[i-2][j] + stairArray[i-1][j+1])%1000000000; // 앞자리 1의 경우, 2번째 전의 행 앞자리 1값 + 1개 행 전의 앞자리 2의 값
                    }else if(j==8) {
                        stairArray[i][j] = (stairArray[i-1][j-1])%1000000000; // 앞자리가 9의 경우, 1행 전의 앞자리가 8인 계단수들이다
                    }else {
                        stairArray[i][j] = (stairArray[i-1][j-1] + stairArray[i-1][j+1])%1000000000;
                    }
                }
            }
        }
//        99 999322116
//        99 479364015
//        99 125084392
//        99 750931969
//        99 750931969
//        99 125084392
//        99 479364015
//        99 999322116
//        99 799458130
//        213895818
        for(int i=0; i<9; i++) {
        	System.out.println(n+" "+stairArray[n-1][i]);
            result += stairArray[n-1][i]; // 앞자리가 1~9인 계단수를 총 합치면 자릿수의 총 계단수가 나온다
        }
        bw.write(String.valueOf(result%1000000000));
        bw.flush();
        
    }
 


}
