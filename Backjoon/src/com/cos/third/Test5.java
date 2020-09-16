package com.cos.third;

public class Test5 {

	public static String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        String tmp="______________";
        if(second%28<tmp.length()) {
        	tmp=tmp.substring(0,tmp.length()-second%28)+phrases.substring(0,second%28);
        }else {
        	tmp=phrases.substring(second%tmp.length())+tmp.substring(0,tmp.length()-phrases.substring(second%tmp.length()).length());
        }
        return tmp;
    }
	
	public static void main(String[] args) {
		  String phrases = new String("happy-birthday");
	        int second = 15;
	        String ret="";
	        for(int i=0; i<30; i++) {
		        ret = solution(phrases, i);
		        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다."+i+"초 후");
	        }
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다."+ret.length());
	        
	}

}
