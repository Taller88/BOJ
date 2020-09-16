package com.cos.two;
import java.util.Arrays;
public class Test8 {

    public static int[] solution(int[] arr) {
        int left = 0, right = arr.length - 1;
        int idx = 0;
        int[] answer = new int[arr.length];
        while(left <= right){
            if(idx % 2 == 0){
                answer[idx] = arr[left];
                left += 1;
            }else{
                answer[idx] = arr[right];
                right -= 1;
            }
            idx += 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ret = solution(arr);

        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + Arrays.toString(ret) + " ?낅땲??");
    }

}
