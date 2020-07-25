package com.back.math2;
import java.util.*;
public class EscapeSquareSolution {

	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[4][2];
        for(int i=0; i<3; i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            boolean checkX=false;
            boolean checkY=false;
            for(int j=0; j<arr.length; j++){
                if(i!=j && arr[i][0]==arr[j][0]){
//                	System.out.println(arr[i][0]+" "+arr[j][0]);
                    checkX=true;
                }
                if(i!=j && arr[i][1]==arr[j][1]){
//                	System.out.println(arr[i][0]+" "+arr[j][0]);
                	checkY=true;
                }
            }
            if(!checkX){
                arr[3][0]=arr[i][0];
             
            }
            if(!checkY){
                arr[3][1]=arr[i][1];
            }
        }
        System.out.println(arr[3][0]+" "+arr[3][1]);
    }
}