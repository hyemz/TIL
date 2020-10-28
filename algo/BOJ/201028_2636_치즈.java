package algo_day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2636_치즈 {
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { 1, 0, -1, 0 };
	static int row, col, cnt;
	static int ch[][];
	static boolean flag;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken()); // 가로
		col = Integer.parseInt(st.nextToken()); // 세로
		ch = new int[row][col]; // 치즈 판
		cnt = 0;
		int answer = 0;
		flag = true;
		// 배열 안에 값 입력
		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < col; j++) {
				ch[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		배열 잘 들어갔는지 확인
	
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				bfs(i, j, cnt);
				cnt++;
				if(cnt > 1) break;
			}
		}

		int max = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				max = Math.max(ch[i][j], max);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (ch[i][j] == max) {
					answer++;
				}
			}
		}
		
	

		System.out.println(max - 1);
		System.out.println(answer);
	}

	private static void bfs(int i, int j, int cnt) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		int cur[] = new int[2];
		cur[0] = i;
		cur[1] = j;
		q.add(cur);
		int visit[][] = new int[row][col];

		while (!q.isEmpty()) {
			cur = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = cur[0] + dy[k];
				int ny = cur[1] + dx[k];

				if (nx >= 0 && ny >= 0 && nx < row && ny < col && visit[nx][ny] == 0 && ch[cur[0]][cur[1]] <= cnt) {
					if (ch[nx][ny] == 1) {
						ch[nx][ny] += cnt;
					}
					q.add(new int[] { nx, ny });
					visit[nx][ny] = 1;
					flag = true;
				}
			}
		}

	}

}