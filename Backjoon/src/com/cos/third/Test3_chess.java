package com.cos.third;

public class Test3_chess {

	public static int solution(String[] bishops) {
        int answer = 0;
        int[][]arr=new int[9][9];
        for(int i=0; i<bishops.length; i++) {
        	String tmp=bishops[i];
        	int y=tmp.charAt(0)-'A'+1;
        	int x=tmp.charAt(1)-'0';
        	arr[x][y]=8;
        	int xx=x;
        	int yy=y;
        	while(true) {
        		xx++;
        		yy++;
        		if(!(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length)) {
        			break;
        		}
        		arr[xx][yy]=1;
        	}
        	xx=x;
        	yy=y;
        	while(true) {
        		
            	xx++;
        		yy--;
        		if(!(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length)) {
        			break;
        		}
        		arr[xx][yy]=1;
        	}
        	xx=x;
        	yy=y;

        	while(true) {
            	xx--;
        		yy++;
        		if(!(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length)) {
        			break;
        		}
        		arr[xx][yy]=1;
        	}
        	xx=x;
        	yy=y;

        	while(true) {
            	xx--;
        		yy--;
        		if(!(xx>=0 && yy>=0 && xx<arr.length && yy<arr[0].length)) {
        			break;
        		}
        		arr[xx][yy]=1;
        	}
        }
        for(int i=1; i<arr.length; i++) {
        	for(int j=1; j<arr[0].length; j++) {
        		System.out.print(arr[i][j]);
        		if(arr[i][j]==0) {
        			answer++;
        		}
        	}
        	System.out.println();
        }
        return answer;
    }

	public static void main(String[] args)throws Exception{

        String[] bishops1 = {new String("D5")};
        int ret1 = solution(bishops1);
        
        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution " + ret1 );

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = solution(bishops2);
        
        // [?ㅽ뻾] 踰꾪듉???꾨Ⅴ硫?異쒕젰 媛믪쓣 蹂????덉뒿?덈떎.
        System.out.println("solution " + ret2 );
    }

	

}
