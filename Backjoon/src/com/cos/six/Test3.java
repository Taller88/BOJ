package com.cos.six;

import java.util.Arrays;

public class Test3 {

	public static int solution(int[] arr, int K) {
    	// 여기에 코드를 작성해주세요.
        int answer = 0;
        Arrays.sort(arr);
        answer=arr[K-1]-arr[0];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
//    	int[] arr = {9, 11, 9, 6, 4, 19};
    	int[] arr = {1,2,3,4,5,6,7};
    	int K = 4;
    	int ret = solution(arr, K);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + "입니다.");
    }

}
