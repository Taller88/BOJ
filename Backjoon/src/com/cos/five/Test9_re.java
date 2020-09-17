package com.cos.five;

import java.util.LinkedList;
import java.util.Queue;

public class Test9_re {

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
	
	private static int solution(int number1, int target1) {
		boolean[]visited=new boolean[10001];
		int answer=bfs(number1, target1, visited);
		return answer;
	}
	static class Node{
		int x,cnt; 
		public Node(int x, int cnt) {
			this.x=x;
			this.cnt=cnt;
		}
	}
	public static int bfs(int number1, int target1, boolean[] visited) {
		Queue<Node> q=new LinkedList<>();
		q.add(new Node(number1, 0));
		visited[number1]=true;
		while(!q.isEmpty()) {
			Node n=q.poll();
			if(n.x==target1) {
				return n.cnt;
			}
			if(n.x+1<10000 && !visited[n.x+1]) {
				visited[n.x+1]=true;
				q.add(new Node(n.x+1, n.cnt+1));
			}
			if(n.x-1>=0 && !visited[n.x-1]) {
				visited[n.x-1]=true;
				q.add(new Node(n.x-1, n.cnt+1));
			}
			if(n.x*2<10000 && !visited[n.x*2]) {
				visited[n.x*2]=true;
				q.add(new Node(n.x*2,n.cnt+1));
			}

		}
		return -1;
	}

}
