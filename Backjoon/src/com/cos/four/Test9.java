package com.cos.four;

public class Test9 {

	public static String solution(int hour, int minute) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        float tmp=hour*30+minute*0.5>minute*6?(float)((hour*30+minute*0.5)-minute*6):(float)(minute*6-(hour*30+minute*0.5));
        answer=String.format("%.1f", tmp);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        int hour = 3;
        int minute = 30;
        String ret = solution(hour, minute);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
