package com.cos.five;
import java.util.*;
public class Test9 {
	static int min=0;
	public static int solution(int number, int target) {
		// 여기에 코드를 작성해주세요.
		int answer = 0;
		bfs(number,target,0);
		answer=min;
		return answer;
	}
	static class Node{
		int x,cnt;
		public Node(int x, int cnt){
			this.x=x;
			this.cnt=cnt;
		}
	}
	public static void bfs(int num, int target, int cnt){
		//연산 1. 1을 더합니다.
		//연산 2. 1을 뺍니다.
		//연산 3. 2를 곱합니다.
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(num,0));
		while(!q.isEmpty()){
			Node t=q.poll();
			if(t.x==target){
				min=t.cnt;
				break;
			}
			q.add(new Node(t.x+1, t.cnt+1));
			if(t.x-1>0){
				q.add(new Node(t.x-1, t.cnt+1));
			}
			q.add(new Node(t.x*2, t.cnt+1));
		}
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
		int number1 = 5;
		int target1 = 9;
		int ret1 = solution(number1, target1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		int number2 = 3;
		int target2 = 11;
		int ret2 = solution(number2, target2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}
