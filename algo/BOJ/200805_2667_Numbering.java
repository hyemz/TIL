import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2667_Numbering {
	static int visit[][];
	static int sum[][];
	static int M, N, cnt;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		int T = 6;
		N = Integer.parseInt(br.readLine());
		sum = new int[N][N];

		// 섬을 채우기
		for (int i = 0; i < N; i++) {
			char s[] = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				sum[i][j] = s[j] - '0';
			}
		}

		visit = new int[N][N];
		cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (sum[i][j] == 1 && visit[i][j] == 0) {
					DFS(i, j, ++cnt);
				}
			}
		}

//		for(int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(visit[i][j]);
//			}
//			System.out.println();
//		}

		int numbers[] = new int[cnt];
		int a = 0;
		System.out.println(cnt);

		for (int t = 1; t <= cnt; t++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (visit[i][j] == t) {
						numbers[t - 1]++;
					}

				}
			}
		}
		a = 0;

//			
		Arrays.sort(numbers);
		for (int x : numbers) {
			System.out.println(x);
		}

//		for(int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(sum[i][j]);
//			}
//			System.out.println();
//		}

//		}

	}

	private static void DFS(int i, int j, int cnt) {
		visit[i][j] = cnt;
		for (int a = 0; a < 4; a++) {
			int nx = i + dy[a];
			int ny = j + dx[a];

			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				if (sum[nx][ny] == 1 && visit[nx][ny] == 0) {
					DFS(nx, ny, cnt);
				}
			}

		}
	}

}
