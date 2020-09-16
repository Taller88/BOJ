package com.cos.five;

public class Test6 {

	 public static String solution(String s1, String s2, int p, int q) {
	        // 여기에 코드를 작성해주세요.
	        String answer = "";
			int tmp=change(s1,p)+change(s2,p);
			String result="";
			while(tmp!=0){
				result+=tmp%q;
				tmp/=q;
			}
			for(int i=result.length()-1; i>=0; i--){
				answer+=result.charAt(i);
			}
	        return answer;
	    }
		public static int change(String in, int p){
			int power=0;
			int result=0;
			while(!in.equals("") || in!=null||in.length()!=0){
				result+=(in.charAt(in.length()-1)-'0')*Math.pow(p,power);
				in=in.substring(0,in.length()-1);
				if(in.length()==0) {
					break;
				}
				power++;
			}
			System.out.println(result);
			return result;
		}
	    
	    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.	
	    public static void main(String[] args) {
	    	String s1 = new String("112001");
	        String s2 = new String("12010");
	        int p = 3;
	        int q = 8;
	    	String ret = solution(s1, s2, p, q);
	    	
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	   }
}
