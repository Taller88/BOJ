package com.back.math2;
import java.util.*;
public class EscapeSquare {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();

		int w=sc.nextInt();
		int h=sc.nextInt();
		int min=0;

		if(x<y) {
			min=x;
		}else {
			min=y;
		}
		if(h-y<min) {
			min=h-y;
		}
		if(w-x<min) {
			min=w-x;
		}
		
		System.out.println(min);
		
	}

}
