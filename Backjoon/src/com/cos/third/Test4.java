package com.cos.third;

public class Test4 {
	
	public static int solution(String s1, String s2) {
        int answer = 0;
        for(int i=1; i<s1.length(); i++) {
        	if(s2.endsWith(s1.substring(0,i))) {
        		System.out.println("s2뒤에 s1 붙이는 경우: "+s1.substring(0,i));
        		answer=i;
        		break;
        	}
        }
        int tmp=0;
        for(int i=1; i<s2.length(); i++) {
        	if(s1.endsWith(s2.substring(0,i))) {
        		System.out.println("s1뒤에 s2 붙이는 경우: "+s2.substring(0,i));
        		tmp=i;
        		break;
        	}
        }
        answer=Math.max(answer, tmp);
        
        
        
        answer=s1.length()+s2.length()-answer;
        return answer;
    }

	public static void main(String[] args) {
		    String s1 = new String("ababc");
	        String s2 = new String("abcdab");
	        int ret = solution(s1, s2);
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
