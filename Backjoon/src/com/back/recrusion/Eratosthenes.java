package com.back.recrusion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Eratosthenes {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int cnt=0;
		boolean[] check=new boolean[n+1];
		for(int i=2; i<=n; i++) {
			check[i]=true;
		}
		for(int i=2; i<=n; i++) {
			for(int j=i; j<=n; j+=i) {
				if(!check[j]) {
					continue;
				}
				check[j]=false;
				cnt++;
				System.out.println(j);
				if(cnt==k) {
					System.out.println(j);
					System.exit(0);
				}
			}
		}
	}

}
