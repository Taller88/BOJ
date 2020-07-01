package com.back.recrusion;

	import java.util.*;
	import java.io.*;

	public class fibo {
	    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
		public static int fibo1(int a){
	       int result=0;
	       if(a==1){
	            return 1;
	        }
	        if(a==0){
	            return 0;
	        }
	        result=fibo1(a-1)+fibo1(a-2);
	        return result;
	    }
	    public static void main(String[]args) throws Exception{
	        //f(n)=f(n-1)+f(n-2)
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        int a=Integer.parseInt(br.readLine());
	        bw.write(fibo1(a)+"");
	           
	        bw.flush();
	    }
	
}
