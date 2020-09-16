package com.cos.two;

public class Test2 {

    public static int func_a(String times){
        int hour = Integer.parseInt(times.substring(0, 2));
        int minute = Integer.parseInt(times.substring(3));
        return hour*60 + minute;
    }
    public static int  solution(String[] subwayTimes, String currentTime) {
        int currentMinute = func_a(currentTime);
        int INF = 1000000000;
        int answer = INF;
        for(int i = 0; i < subwayTimes.length; ++i){
            int subwayMinute = func_a(subwayTimes[i]);
            if(subwayMinute>=currentMinute){
                answer = subwayMinute - currentMinute;
                break;
            }
        }
        if(answer == INF)
            return -1;
        return answer;
    }


    public static void main(String[] args) {
        String[] subwayTimes1 = {"05:31", "11:59", "13:30", "23:32"};
        String currentTime1 = "12:00";
        int ret1 = solution(subwayTimes1, currentTime1);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret1 + " ?낅땲??");

        String[] subwayTimes2 = {"14:31", "15:31"};
        String currentTime2 = "15:31";
        int ret2 = solution(subwayTimes2, currentTime2);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret2 + " ?낅땲??");
    }


}
