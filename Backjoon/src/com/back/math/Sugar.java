package com.back.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sugar {
//18
//4
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int total=Integer.parseInt(br.readLine());
        int env=0;
        if(total%5==0) {//5의 배수이면
        	env+=total/5;
        }else if((total%5)%3==0) {//5로 나누고 그 나머지가 3의 배수면 18
        	env+=total/5+(total%5)/3;
        }else if((total-5)%3==0){
        	env+=(total-5)/3+1;
        }else if(total%3==0){//6
        	env+=total/3;
        }else {
        	env=-1;
        }
        bw.write(env+"");
        bw.flush();
	}

}
