package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SecretPassword {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		String secret="";
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)-3<'A'+0) {
				secret+=(char)('Z'+input.charAt(i)-2-'A')+"";
			}else {
				secret+=(char)(input.charAt(i)-3)+"";
			}
		}
		System.out.println(secret);
	}

}
