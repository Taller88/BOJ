package com.back.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StringSum {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt=Integer.parseInt(br.readLine());
			String input;
			
			input = br.readLine();
			int answer=0;
			for(int i=0; i<cnt; i++) {
				answer+=input.charAt(i)-'0';
				
			}
			bw.write(answer+"\n");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		

}
