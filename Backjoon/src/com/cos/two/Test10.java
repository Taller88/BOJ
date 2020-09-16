package com.cos.two;

public class Test10 {


    public static String solution(String s) {
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '0' && s.charAt(i+1) != '0')
                answer += "0";
            else if(s.charAt(i) == '1')
                answer += "1";
        }
        return answer;
    }

    // ?꾨옒???뚯뒪?몄??댁뒪 異쒕젰???대낫湲??꾪븳 main 硫붿냼?쒖엯?덈떎. main 硫붿냼?쒕뒗 ?섎せ??遺遺꾩씠 ?놁쑝?? solution 硫붿냼?쒕쭔 ?섏젙?섏꽭??
    public static void main(String[] args) {
        String s = "101100011100";
//  1011110111101
//	101101110
//  101101110"
        String ret = solution(s);
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret + " ?낅땲??");
    }


}