package com.back.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palendrum {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int check=1;
		if(input.length()==1) {
			System.out.println(1);
			return;
		}
		if(input.length()%2==0) {
			String s=input.substring(0, input.length()/2);
			String rev=input.substring(input.length()/2);
			int idx=0;
			for(int i=rev.length()-1; i>=0; i--) {
				System.out.println(rev.charAt(i)+" "+s.charAt(idx));
				if(rev.charAt(i)!=s.charAt(idx)) {
					check=0;
					break;
				}
				idx++;
			}
			
		}else {
			String s=input.substring(0, input.length()/2);
			String rev=input.substring(input.length()/2+1);
			int idx=0;
			for(int i=rev.length()-1; i>=0; i--) {
				System.out.println(rev.charAt(i)+" "+s.charAt(idx));
				if(rev.charAt(i)!=s.charAt(idx)) {
					check=0;
					break;
				}
				idx++;
			}
		}
		System.out.println(check);
	}

}
