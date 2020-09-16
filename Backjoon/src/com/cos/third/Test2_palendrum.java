package com.cos.third;
import java.util.ArrayList;
import java.util.Collections;
public class Test2_palendrum {
	
	public static boolean func_a(ArrayList<String> list, String s) {
		for (int i = 0; i < list.size(); i++)
			if (s.equals(list.get(i)))
				return true;
		return false;
	}

	public static  boolean func_b(String s) {
			int length = s.length();
			for (int i = 0; i < length / 2; i++)
				if (s.charAt(i) != s.charAt(length - i - 1))
					return false;
			return true;
		}
	
	public static  String func_c(ArrayList<String> palindromes, int k) {
		Collections.sort(palindromes);
		if (palindromes.size() < k)
			return "NULL";
		else
			return palindromes.get(k-1);
	}
	
	public static String solution(String s, int k) {
		ArrayList<String> palindromes = new ArrayList<String>();
		int length = s.length();
		for (int startIdx = 0; startIdx < length; startIdx++) {
		for (int cnt = 1; cnt < length - startIdx + 1; cnt++) {
		String subStr = s.substring(startIdx, startIdx + cnt);
		if (func_b(subStr )) {
			if (func_a(palindromes,subStr ) == false)
				palindromes.add(subStr);
		}
		}
	}
	
	String answer = func_c(palindromes,k);
	return answer;
	}


	public static void main(String[] args) {
		String s1 = new String("abcba");
		int k1 = 4;
		String ret1 = solution(s1, k1);

		// [?ㅽ-] 踰'í듉???'瑜대©?異쒕젰 媛'ì' 蹂????덉뒿?덈떎. 
		System.out.println("solution  " + ret1 );

		String s2 = new String("ccddcc");
		int k2 = 7;
		String ret2 = solution(s2, k2);

		// [?ㅽ-] 踰'í듉???'瑜대©?異쒕젰 媛'ì' 蹂????덉뒿?덈떎. 
		System.out.println("solution" + ret2 );
	}

}
