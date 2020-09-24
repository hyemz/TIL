package com.ssafy.practice;

import java.util.Scanner;

public class 방배정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		int s[][] = new int[2][6];
		for(int i = 1; i <= N; i++) {
			s[sc.nextInt()][sc.nextInt()-1]++;
		}
		
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 6; j++) {
//				System.out.print(s[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 6; j++) {
				if(s[i][j] == 0) continue;
				if(s[i][j] > k) {
					cnt += (s[i][j] / k);
					if(s[i][j] % k == 0) continue;
				} 
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
