

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_7576_토마토 {
	static int col, row, cnt;
	static int box[][];
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		cnt = 0;

		box = new int[row][col];
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		bfs();
		
		boolean answer = true;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (box[i][j] == 0) {
					answer = false;
				}
				if (cnt < box[i][j]) {
					cnt = box[i][j] - 1;
				}

			}
		}
		// 3항 연산자를 사용해서 false면 -1로!
		System.out.println(answer ? cnt : -1);
	}

	private static void bfs() {
		// TODO Auto-generated method stub
		int cur[] = new int[2];
		Queue<int[]> q = new LinkedList<>();

		// 1로 되어 있으면 같이 토마토가 퍼져야하니까 큐에 넣어준다.
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (box[i][j] == 1) {
					q.add(new int[] { i, j });
				}
			}
		}

		while (!q.isEmpty()) {
			cur = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dx[k];
				int ny = cur[1] + dy[k];

				if (nx >= 0 && ny >= 0 && nx < row && ny < col && box[nx][ny] == 0) {
					box[nx][ny] = box[cur[0]][cur[1]] + 1;
					q.add(new int[] { nx, ny });
				}
			}
		}
	}

}
