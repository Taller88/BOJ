package com.cos.one;

public class Test6 {

	public static void main(String[] args) {
		//0, 1, 2 - 가위, 바위, 보
		int arr[]= {2,0,0,0,0,0,1,1,0,0};
		int brr[]= {0,0,0,0,2,2,0,2,2,2};
		
		int a=solution(arr,brr);

		System.out.println(a);
	}

	private static int solution(int[] arr, int[] brr) {
		int pos=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {//a가 가위
				if(brr[i]==2) {//b가 보
					pos+=3;
				}else if(brr[i]==1) {//b가 바위
					if(pos>0) {
						pos-=1;
					}
				}
			}else if(arr[i]==1) {//a가 바위
				if(brr[i]==0) {//b가 가위
					pos+=3;
				}else if(brr[i]==2) {//b가 보
					if(pos>0) {
						pos-=1;
					}
				}
			}else {//a가 보
				if(brr[i]==1) {//b가 보
					pos+=3;
				}else if(brr[i]==0) {//b가 바위
					if(pos>0) {
						pos-=1;
					}
				}
			}
		}
		return pos;
	}

}
