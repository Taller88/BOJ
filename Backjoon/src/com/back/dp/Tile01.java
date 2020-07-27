package com.back.dp;
import java.util.*;
public class Tile01 {
	static long[] dp;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        dp =new long[num+1];
        System.out.println(dp(num));
     }
     public static long dp(int num){
         if(num==1){
             return 1;
         }
         if(num==2){
             return 2;
         }
//         System.out.println(num);
         if(dp[num]!=0) {
        	 return dp[num];
         }
         return dp[num]=dp(num-1)+dp(num-2);
     }

}
