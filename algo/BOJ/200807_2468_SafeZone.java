package day0807;

import java.util.Scanner;

public class SafeZone {
	static int n, cnt, result;
	static int min = Integer.MAX_VALUE;
	static int max = 0;
	static int safe[][];
	static int safe_b[][];
	static int visit[][];
	static int num[];
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	private static void DFS(int i, int j, int cnt) {
		visit[i][j] = cnt;
		for (int a = 0; a < 4; a++) {
			int nx = i + dy[a];
			int ny = j + dx[a];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
				if (safe[nx][ny] == 1 && visit[nx][ny] == 0) {
					DFS(nx, ny, cnt);
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 배열의 개수
		n = sc.nextInt();
		safe = new int[n][n];
		safe_b = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				safe[i][j] = safe_b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (safe[i][j] < min) {
					min = safe[i][j];
				}
				if (safe[i][j] > max) {
					max = safe[i][j];
				}
			}
		}

		num = new int[max + 1];
		for (int k = min; k <= max; k++) {
			if (k == 1) {
				result = 1;
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (safe[i][j] <= k)
						safe[i][j] = 0;
					else
						safe[i][j] = 1;
				}
			}

			visit = new int[n][n];
			cnt = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (safe[i][j] == 1 && visit[i][j] == 0) {
						DFS(i, j, ++cnt);
					}
				}
			}

			if (result < cnt)
				result = cnt;
			for (int i = 0; i < n; i++) {
				System.arraycopy(safe_b[i], 0, safe[i], 0, n);
			}

		}
		System.out.println(result);

	}

}
