package com.cos.last;

public class Test1 {
	public static long solution(long num) {
		System.out.println(num);
        num++;
        System.out.println(num);
        long digit = 1;
        String[] n=String.valueOf(num).split("");
//        System.out.println(num/digit%10);
        
       for(int i=0; i<n.length; i++) {
    	   if(n[i].equals("0")) {
    		   n[i]="1";
    	   }
       }
       String tmp="";
       for(int i=0; i<n.length; i++) {
    	   tmp+=n[i];
       }
       num=Long.parseLong(tmp);
        return num;
    }
	public static void main(String[] args) {
		System.out.println(solution(10002));
	}

}
