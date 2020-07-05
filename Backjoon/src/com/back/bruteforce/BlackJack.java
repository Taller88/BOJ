package com.back.bruteforce;
import java.util.*;

public class BlackJack {
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==j){
                        continue;
                    }
                    for(int z=0; z<n; z++){
                        if(i==z || z==j){
                            continue;
                        }
                        int tmp=arr[i]+arr[j]+arr[z];
                        if(tmp<=m && tmp>max){
                            max=tmp;
                        }
                    }//for
                }//m-for
            }//f-for
            System.out.println(max);
        
    }
}
