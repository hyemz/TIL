import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {
	static int dx[] = {0, 0, -1, 1, 0, 0};
	static int dy[] = {1, -1, 0, 0, 0, 0};
	static int dz[] = {0, 0, 0, 0, -1, 1};
	static int row, col, height;
	static int arr[][][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		height = Integer.parseInt(st.nextToken());
		
		arr =  new int[height][row][col];
		Queue<int[]> tomato = new LinkedList<int[]>();
		int cnt = 0, days = 0;
		
		for(int h = height-1; h >= 0; h--) {
			for(int i = 0; i < row; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < col; j++) {
					arr[h][i][j] = Integer.parseInt(st.nextToken());
					if(arr[h][i][j] == 0) {
						cnt++;
					}
					else if(arr[h][i][j] == 1) {
						tomato.add(new int[] {h, i, j});
					}
				}
			}
		}
		
		bfs(tomato, cnt, days);
		
	}
	private static void bfs(Queue<int[]> tomato, int cnt, int days) {
		// TODO Auto-generated method stub
		while(!tomato.isEmpty() && cnt > 0) {
			int size = tomato.size();
			for(int i = 0; i < size; i++) {
				int[] t = tomato.poll();
				int z = t[0];
				int x = t[1];
				int y = t[2];
				
				for(int k = 0; k < 6; k++) {
					int nz = z + dz[k];
					int nx = x + dx[k];
					int ny = y + dy[k];
					
					if (nz < 0 || ny < 0 || nx < 0 || nz >= height || ny >= col || nx >= row) {
						continue;
					}
					else if (arr[nz][nx][ny] != 0) {
						continue;
					}
					
					cnt--;
					arr[nz][nx][ny] = 1;
					tomato.offer(new int[] {nz, nx, ny});
				}
			}
			days++;
		}
		System.out.println(cnt == 0 ? days : -1);
	}
	
	
}