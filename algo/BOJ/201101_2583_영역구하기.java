package com.ssafy.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2583_영역구하기 {
	static int row, col, cnt, temp[];
	static int rect[][], visit[][];
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { -1, 1, 0, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		col = sc.nextInt(); // 행
		row = sc.nextInt(); // 열
		cnt = sc.nextInt(); // 직사각형 수

		rect = new int[row][col];
		visit = new int[row][col];

		for (int k = 1; k <= cnt; k++) {
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int s3 = sc.nextInt();
			int s4 = sc.nextInt();

			for (int i = s1; i < s3; i++) {
				for (int j = s2; j < s4; j++) {
					rect[i][j] = -1;
				}
			}
		}
		
		cnt = 1; // 변수 재사용해서 나머지 영역 개수 표시
		temp = new int[100]; // 최대가 100이니까 초기화
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (rect[i][j] != -1 && visit[i][j] == 0) {
					dfs(i, j, cnt);
					cnt++;
				}
			}
		}

		System.out.println(cnt - 1); // 영역 개수 

		int answer[] = new int[cnt - 1];
		for (int t = 0; t < cnt - 1; t++) {
			answer[t] = temp[t] + 1;
		}
		Arrays.sort(answer);

		for (int a = 0; a < cnt - 1; a++) {
			System.out.print(answer[a] + " ");
		}

	}

	private static void dfs(int i, int j, int cnt) {
		// TODO Auto-generated method stub
		visit[i][j] = cnt;
		for (int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];

			if (nx >= 0 && ny >= 0 && nx < row && ny < col) {
				if (rect[nx][ny] != -1 && visit[nx][ny] == 0) {
					visit[nx][ny] = cnt;
					temp[cnt - 1]++;
					dfs(nx, ny, cnt);
				}
			}
		}
	}

}
