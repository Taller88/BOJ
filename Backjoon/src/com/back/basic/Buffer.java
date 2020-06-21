package com.back.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffer {

	public static void main(String[] args) {

		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
			
			int cnt=Integer.parseInt(br.readLine());
			for(int i=0; i<cnt; i++) {
				String tmp=br.readLine();
				StringTokenizer st = new StringTokenizer(tmp); //StringTokenizer인자값에 입력 문자열 넣음
				int a = Integer.parseInt(st.nextToken()); //첫번째 호출
				int b = Integer.parseInt(st.nextToken()); //두번째 호출
				bw.write(a+b+"\n");
			}
			bw.close();//스트림을 닫음
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
