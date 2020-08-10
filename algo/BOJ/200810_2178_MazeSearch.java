package com.ssafy.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2178_MazeSearch {
	static int maze[][];
	static int N, M, cnt;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();

		// 2차원 배열에 값 채우기
		maze = new int[N][M];
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < M; j++) {
				maze[i][j] = s.charAt(j) - '0';
			}
		}

//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(maze[i][j]);
//			}
//			System.out.println();
//		}

		BFS(0, 0);
		System.out.println(maze[N - 1][M - 1]);
	}

	public static void BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<int[]>();
		int current[];
		boolean visit[][] = new boolean[N][M];
		cnt = 1;

		q.offer(new int[] { x, y });
		visit[x][y] = true;

		int nx = 0, ny = 0;
		while (!q.isEmpty()) {

			current = q.poll();

			for (int i = 0; i < 4; i++) {
				nx = current[0] + dy[i];
				ny = current[1] + dx[i];

				if (nx < N && ny < M && nx >= 0 && ny >= 0 && maze[nx][ny] == 1 && visit[nx][ny] == false) {
					visit[nx][ny] = true;
					q.offer(new int[] { nx, ny });
					maze[nx][ny] = maze[current[0]][current[1]] + 1;
				}
			}
		}

	}

}
