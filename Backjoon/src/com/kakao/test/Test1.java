package com.kakao.test;

import java.util.PriorityQueue;

public class Test1 {
	    
	    static class Node implements Comparable<Node>{
	        int x,cnt;
	        public Node(int x, int cnt){
	            this.x=x;
	            this.cnt=cnt;
	        }
	        public int compareTo(Node o){
	            return this.cnt-o.cnt;
	        }
	    }
	    
	    static int answer = 0;
	    
	    public static int solution(int n, int s, int a, int b, int[][] fares) {
	        
	        bfs(s,a,b,fares);
	        return answer;
	    }
	    public static void bfs(int s, int aT, int bT, int[][] fares){
	        PriorityQueue<Node> aq=new PriorityQueue<>();
	        PriorityQueue<Node> bq=new PriorityQueue<>();
	        aq.add(new Node(s,0));
	        bq.add(new Node(s,0));
	        int cost=0;
	        while(!aq.isEmpty() &&!bq.isEmpty()){
	            Node a=null;
	            Node b=null;
	            int check=0;

	            if(!aq.isEmpty()){
	                a=aq.poll();
	            }
	            if(!bq.isEmpty()){
	                b=bq.poll();
	            }
	            
	            if(a!=null && a.x==aT){
	                answer+=a.cnt;
	               // System.out.println("A: "+a.cnt);
	                check+=1;
	            }
	            if(b!=null && b.x==bT){
	                answer+=b.cnt;
	                //System.out.println("B: "+b.cnt);
	                check+=1;
	            }
	            if(check==2){
	                return;
	            }
	            if(a!=null){
	               System.out.println(a.x);
	            }
	            for(int i=0; i<fares.length; i++){
	                if(a!=null && (a.x==fares[i][0]||a.x==fares[i][1])){
	                    aq.add(new Node(fares[i][1],a.cnt+fares[i][2]));
	                }
	                if(b!=null && (b.x==fares[i][0]||b.x==fares[i][1])){
	                    bq.add(new Node(fares[i][1],b.cnt+fares[i][2]));
	                }
	            }
	            
	        }
	            
	    }
	
	
	public static void main(String[] args) {
		String tmp=".as.d.";
//		System.out.println(tmp.toLowerCase());
//		System.out.println('a'+0);
//		System.out.println('z'+0);
//		
//		tmp=tmp.replace("_", "");
//		System.out.println(tmp.startsWith("."));
//		System.out.println(tmp.endsWith("."));
//		System.out.println("? "+tmp.substring(1));
//		System.out.println(tmp.substring(0,tmp.length()-1));
//		
//		System.out.println('0'+0);
//		System.out.println('1'+0);
//		System.out.println('9'+0);
				
		int[][]fares= {{5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6}};
		solution(7, 3, 4, 1, fares);
	}

}
