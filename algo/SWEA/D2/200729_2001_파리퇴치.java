package com.ssafy.algo;

import java.util.Scanner;

public class flyKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); // 배열 크기
			int M = sc.nextInt(); // 파리채 크기
			int count = 0;
			int max = 0;

			int[][] kill = new int[N][N];
			// 배열에 값 넣기
			for (int i = 0; i < kill.length; i++) {
				for (int j = 0; j < kill.length; j++) {
					kill[i][j] = sc.nextInt();
				}
			}

			for (int x = 0; x < kill.length-M+1; x++) {
				for (int y = 0; y < kill.length-M+1; y++) {
					for (int i = 0; i < M; i++) {
						for (int j = 0; j < M; j++) {
							if (x+i < 0 && x+i >= N || y+j < 0 && y+j >= N) break;
							count += kill[x+i][y+j];
						}
						
					}
					if(max < count) max = count;
					count = 0;
					
				}
			}
			System.out.println("#" + test_case+ " " + max);
		}
	}

}
