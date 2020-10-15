

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NHN_PreTest_1 {
	
	// 방문 처리 배열
	static int visited[][];
	
	// 데이터를 담을 배열
	static int box[][];
	
	// 배열의 크기, 그룹 개수 변수 선언
	static int N, cnt;
	
	// 2차원 배열 탐색을 위한 사전 작업
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, -1, 0, 1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		// 배열 선언
		box = new int[N][N];
		visited = new int[N][N];

		// 배열 입력
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		// 배열 잘 들어갔는지 체크 
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				System.out.print(box[i][j]);
//			}
//			System.out.println();
//		}
		
		// dfs 문을 배열의 값이 1이고 한번도 방문하지 않은 곳일 때만 돌린다. 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (box[i][j] == 1 && visited[i][j] == 0)
					dfs(i, j, ++cnt); // 재귀를 한번 돌면 1에 인접한 곳은 cnt로 처리했으니 cnt를 늘려서 2로 넘버링 해준다. 
			}
		}
		
		// 넘버링 한 것의 숫자를 세기 위해 배열 생성 
		int num[] = new int[cnt];
		
		// cnt만큼 반복, 배열을 다시 탐색해 각 구역에 몇 개가 있는지 num 배열에 넣어준다.
		for (int t = 1; t <= cnt; t++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (visited[i][j] == t)
						num[t - 1]++;
				}
			}
		}

		// 오름차순 정렬
		Arrays.sort(num);
		
		// 그룹이 몇 개인지 출력
		System.out.println(cnt);
		
		// 그룹당 개수 출력 (num)
		for (int i = 0; i < cnt; i++) {
			// 그룹이 없다면 0을 출력한다.
			if (cnt == 0) {
				System.out.print(0);
				break;
			}
			System.out.print(num[i]);
			
			// 띄어쓰기를 위한 if문 / 마지막 출력값에는 공백이 없어야한다.
			if (i != cnt - 1)
				System.out.print(" ");
		}

	}

	// 1인 곳은 방문 처리해주고 값을 늘려준다. 
	private static void dfs(int x, int y, int cnt) {
		visited[x][y] = cnt; // cnt로 설정 
		
		// 순차적으로 배열을 탐색
		for (int k = 0; k < 4; k++) {
			int nx = x + dy[k];
			int ny = y + dx[k];

			// 배열에 범위에 벗어나지 않으면
			if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
				// 배열이 값이 1이고, 방문하지 않았다면
				if (box[nx][ny] == 1 && visited[nx][ny] == 0) {
					// 다시 dfs 탐색
					dfs(nx, ny, cnt);
				}
			}
		}

	}

}
