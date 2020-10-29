package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_3184_양 {
	static int row, col, vCnt, oCnt, vTotal, oTotal;
	static char[][] yard;
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { -1, 1, 0, 0 };
	static boolean visited[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		visited = new boolean[row][col];
		yard = new char[row][col];

		for (int i = 0; i < row; i++) {
			char c[] = br.readLine().toCharArray();
			for (int j = 0; j < col; j++) {
				yard[i][j] = c[j];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (yard[i][j] != '#' && !visited[i][j])
					bfs(i, j);
			}
		}

		System.out.print(oTotal + " ");
		System.out.print(vTotal);
	}

	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { i, j });
		int cur[] = new int[2];

		visited[i][j] = true;
		vCnt = 0;
		oCnt = 0;
		if (yard[i][j] == 'v')
			vCnt++;
		if (yard[i][j] == 'o')
			oCnt++;

		while (!q.isEmpty()) {
			cur = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];

				if (nx < row && ny < col && nx >= 0 && ny >= 0 && !visited[nx][ny]) {
					if (yard[nx][ny] != '#') {
						visited[nx][ny] = true;
						q.offer(new int[] { nx, ny });

						if (yard[nx][ny] == 'v') {
							vCnt++;
						}
						if (yard[nx][ny] == 'o') {
							oCnt++;
						}
					}

				}
			}
		}
		if (vCnt >= oCnt)
			vTotal += vCnt;
		else
			oTotal += oCnt;
	}
}
