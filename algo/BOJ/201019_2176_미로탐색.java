
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2176_미로탐색 {
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };
	static boolean visited[][];
	static int N, M, cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int arr[][] = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			char s[] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				arr[i][j] = s[j] - '0';
			}
		}

		cnt = 1;
		bfs(0, 0, arr);
		System.out.println(arr[N - 1][M - 1]);
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < M; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
	}

	private static void bfs(int i, int j, int[][] arr) {
		// TODO Auto-generated method stub
		Queue<int[]> q = new LinkedList<>();
		int cur[] = new int[2];
		q.offer(new int[] {i, j});
		
		int nx = 0, ny = 0;
		while (!q.isEmpty()) {
			cur = q.poll();
			for (int k = 0; k < 4; k++) {
				nx = cur[0] + dy[k];
				ny = cur[1] + dx[k];

				if (nx < N && ny < M && nx >= 0 && ny >= 0 && !visited[nx][ny] && arr[nx][ny] == 1) {
					visited[nx][ny] = true;
					q.offer(new int[] {nx, ny});
					arr[nx][ny] = arr[cur[0]][cur[1]] + 1;
				}
			}
		}

	}

//	private static void dfs(int i, int j, int[][] arr, int cnt) {
//		// TODO Auto-generated method stub
//		visited[i][j] = true;
//
//		int nx = 0, ny = 0;
//		for (int k = 0; k < 4; k++) {
//			nx = i + dy[k];
//			ny = j + dx[k];
//
//			if (nx < N && ny < M && nx >= 0 && ny >= 0 && !visited[nx][ny] && arr[nx][ny] == 1) {
//				visited[nx][ny] = true;
//				arr[nx][ny] = arr[i][j] + 1;
//				dfs(nx, ny, arr, cnt);
//			}
//		}
//
//	}

}
