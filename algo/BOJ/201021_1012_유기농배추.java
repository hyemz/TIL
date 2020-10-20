

import java.util.Scanner;

public class BOJ_1012_유기농배추 {
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { -1, 1, 0, 0 };
	static int visit[][];
	static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int T = 1; T <= t; T++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			int num = sc.nextInt();

			int arr[][] = new int[row][col];
			for (int i = 0; i < num; i++) {
				arr[sc.nextInt()][sc.nextInt()] = 1;
			}
			visit = new int[row][col];
			cnt = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (arr[i][j] == 1 && visit[i][j] == 0)
						dfs(i, j, arr, row, col, ++cnt);
				}
			}
			System.out.println(cnt);
//			for (int i = 0; i < row; i++) {
//				for (int j = 0; j < col; j++) {
//					System.out.print(visit[i][j]);
//				}
//				System.out.println();
//			}
		}
	}

	private static void dfs(int i, int j, int[][] arr, int row, int col, int cnt) {
		// TODO Auto-generated method stub
		visit[i][j] = cnt;
		for (int k = 0; k < 4; k++) {
			int nx = i + dy[k];
			int ny = j + dx[k];

			if (nx >= 0 && ny >= 0 && nx < row && ny < col && visit[nx][ny] == 0 && arr[nx][ny] == 1) {
				visit[nx][ny] = cnt;
				dfs(nx, ny, arr, row, col, cnt);
			}
		}
	}
}
