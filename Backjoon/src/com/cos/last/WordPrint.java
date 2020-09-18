package com.cos.last;

public class WordPrint {
	public int solution(int K, String[]words) {
		int answer=0;
		int save=K;
		for(int i=0; i<words.length; i++) {
			K=save;
			K-=(words[i].length());
			String tmp=words[i];
			while(i!=words.length-1 && K-1>=words[i+1].length()) {
				K-=(words[i+1].length()+1);
				tmp+="_"+words[i+1];
				i++;
			}
			System.out.println(tmp);
			
			
			answer++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		WordPrint sol=new WordPrint();
		int K=10;
		String[] words= {"a", "b", "c", "d", "hi"};
		System.out.println(sol.solution(K,words));
	}

}
