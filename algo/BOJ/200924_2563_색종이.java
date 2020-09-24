package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_2563_색종이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 색종이 수
		int pan[][] = new int [100][100];
		int total = 0;
		
		for(int i = 0; i < N; i++) {
			int fromX = sc.nextInt();
			int fromY = sc.nextInt();
			for(int x = fromX; x < fromX + 10; x++) {
				for(int y = fromY; y < fromY + 10; y++) {
					pan[x][y] = 1;
				}
			}
		}
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(pan[i][j] == 1) total++;
			}
		}
		System.out.println(total);
		
		
	}
}
