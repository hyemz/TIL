package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11123_양한마리양두마리 {

	static int row, col, cnt;
	static boolean visit[][];
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());

			char ground[][] = new char[row][col];
			visit = new boolean[row][col];
			for (int i = 0; i < row; i++) {
				char c[] = br.readLine().toCharArray();
				for (int j = 0; j < col; j++) {
					ground[i][j] = c[j];
				}
			}
			cnt = 1;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (!visit[i][j] && ground[i][j] == '#') {
						bfs(i, j, ground);
						cnt++;
					}
				}

			}
			System.out.println(cnt - 1);
		}

	}

	private static void bfs(int i, int j, char[][] ground) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		int cur[] = new int[2];
		q.offer(new int[] { i, j });
		visit[i][j] = true;

		while (!q.isEmpty()) {
			cur = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];

				if (nx >= 0 && ny >= 0 && nx < row && ny < col && ground[nx][ny] != '.' && !visit[nx][ny]) {

					q.offer(new int[] { nx, ny });
					visit[nx][ny] = true;

				}
			}
		}
	}

}
