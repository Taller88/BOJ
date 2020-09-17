package com.cos.one;

public class Test2 {
	
	public static void main(String[] args) {
		System.out.println(solution(2));
	}
	static int[] dx= {0,1,0,-1};
	static int[] dy= {1,0,-1,0};
	
	private static int solution(int num) {
		int sum=0;
		int[][]arr=new int[num][num];
//		0,0 -> 0,1 -> 0,2 -> 1,2 -> 2,2 -> 2,1 -> 2,0 -> 1,0 -> 1,1
		//f(1)- 1
		//f(2)- 1,3 ->4
		//f(3)- 1,5,9 ->15
		//f(4)- 1,7,13,15-> 36
		//f(5)- 1,9,17,21,25-> 73
		
		//1  2  3  4  5 
		//16 17	18 19 6
		//15 24	25 20 7
		//14 23 22 21 8
		//13 12 11 10 9
		if(num==1) {
			return 1;
		}
		int v=1;
		int xx=0;
		int yy=0;
		int idx=0;
		while(arr[xx][yy]==0) {
			arr[xx][yy]=v++;
			
			xx=xx+dx[idx%4];
			yy=yy+dy[idx%4];
			System.out.println(xx+" "+yy);
			if(xx<0 || yy<0 || xx>=arr.length || yy>=arr.length||arr[xx][yy]!=0 ) {
				xx=xx-dx[idx%4];
				yy=yy-dy[idx%4];
				idx++;
				xx=xx+dx[idx%4];
				yy=yy+dy[idx%4];
			}
			
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
				if(i==j) {
					sum+=arr[i][j];
				}
			}
			System.out.println();
		}
		return sum;
	}

}
