package com.cos.two;

public class Test9 {
	
    public static boolean solution(String password) {
        int length = password.length();
        for(int i = 0; i < length - 2; ++i){
            int firstCheck = password.charAt(i + 1) - password.charAt(i);
            int secondCheck = password.charAt(i+2) - password.charAt(i+1);
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false;
        }
        return true;
    }


    // ?꾨옒???뚯뒪?몄??댁뒪 異쒕젰???대낫湲??꾪븳 main 硫붿냼?쒖엯?덈떎. main 硫붿냼?쒕뒗 ?섎せ??遺遺꾩씠 ?놁쑝?? solution 硫붿냼?쒕쭔 ?섏젙?섏꽭??
    public static void main(String[] args) {
        String password1 = "cospro890";
        boolean ret1 = solution(password1);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret1 + " ?낅땲??");


        String password2 = "cba323";
        boolean ret2 = solution(password2);

        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution 硫붿냼?쒖쓽 諛섑솚 媛믪? " + ret2+ " ?낅땲??");       
    }

}
