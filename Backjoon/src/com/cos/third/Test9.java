package com.cos.third;

public class Test9 {
	public static int solution(int[] revenue, int k) {
        int answer = 0;
        int n = revenue.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += revenue[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum = sum - revenue[i - k] + revenue[i];
            if (answer < sum)
                answer = sum;
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] revenue1 = {1, 1, 9, 3, 7, 6, 5, 10};
        int k1 = 4;
        int ret1 = solution(revenue1, k1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] revenue2 = {1, 1, 5, 1, 1};
        int k2 = 1;
        int ret2 = solution(revenue2, k2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
	}

}