import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단지번호붙이기 {
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {1, -1, 0, 0};
	static int N;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		int arr[][] =  new int[N][N];
		boolean visited[][] = new boolean[N][N];
		int cnt = 1; 
			
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					dfs(arr, visited, i, j, cnt);
					cnt++;
				}
			}
		}
		
		System.out.println(cnt-1);
		int answer[] = new int[cnt];
		for(int c = 1; c < cnt; c++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if (arr[i][j] == c) {
						answer[c]++;
					}
				}
			}
		}
		Arrays.sort(answer);
		for(int i = 1; i < cnt; i++) {
			System.out.println(answer[i]);
		}
	}

	private static void dfs(int[][] arr, boolean[][] visited, int i, int j, int cnt) {
		// TODO Auto-generated method stub
		visited[i][j] = true;
		arr[i][j] = cnt;
		
		for(int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			 
			if(nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && arr[nx][ny] == 1) {
					visited[nx][ny] = true;
					dfs(arr, visited, nx, ny, cnt);
			}
		}
	}
}