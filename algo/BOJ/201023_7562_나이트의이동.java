

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_7562_나이트의이동 {

	static int dx[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int[][] visit;
	static int N, cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {

			N = sc.nextInt();
			int pan[][] = new int[N][N];
			visit = new int[N][N];

			int startX = sc.nextInt();
			int startY = sc.nextInt();
			int endX = sc.nextInt();
			int endY = sc.nextInt();
			pan[startX][startY] = 1;
			pan[endX][endY] = 1;

			cnt = 0;
			bfs(startX, startY, endX, endY, pan);
			System.out.println(pan[endX][endY] - 1);

		}

	}

	private static void bfs(int startX, int startY, int endX, int endY, int[][] pan) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		int cur[] = new int[2];
		q.add(new int[] { startX, startY });
		visit[startX][startY] = 1;

		while (!q.isEmpty()) {
			cur = q.poll();
			cnt++;

			if (cur[0] == endX && cur[1] == endY)
				return;

			for (int k = 0; k < 8; k++) {
				int nx = cur[0] + dy[k];
				int ny = cur[1] + dx[k];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N && visit[nx][ny] == 0) {
					pan[nx][ny] = pan[cur[0]][cur[1]] + 1;
					visit[nx][ny] = 1;
					q.add(new int[] { nx, ny });

				}
			}
		}
	}

}
