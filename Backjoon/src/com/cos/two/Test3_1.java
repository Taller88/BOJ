package com.cos.two;

public class Test3_1 {


    public static int func_a(int n){
        int ret = 1;
        while(n > 0){
            ret *= 10;
            n--;
        }
        return ret;
    }

    static int func_b(int n){
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10;
        }
        return ret;
    }
    
    static int func_c(int n){
        int ret = 0;
        while(n > 0){
            ret += n%10;
            n /= 10;
        }
        return ret;
    }
    
	public static int solution(int num) {
        int next_num = num;
        while(true){
            next_num++;
            int length = func_b(next_num);
            if(length % 2 != 0)
                continue;
            int divisor = func_a(length/2);
            
            int front = next_num / divisor;
            int back = next_num % divisor;
            
            int front_sum = func_c(front);
            int back_sum = func_c(back);
            if(front_sum == back_sum)
                break;
        }
        return next_num - num;
    }

    public static void main(String[] args) {
        int num1 = 1;
        int ret1 = solution(num1);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret1 + " ?낅땲??");

        int num2 = 235386;
        int ret2 = solution(num2);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret2 + " ?낅땲??");
    }

}
