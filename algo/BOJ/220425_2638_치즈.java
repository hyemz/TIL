import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 치즈 {
	static int dx[] = {1, -1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int row, col, days, cnt, size;
	static int arr[][];
	static boolean visited[][];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		arr =  new int[row][col];
		visited = new boolean[row][col];
		Queue<int[]> chz = new LinkedList<int[]>();
		cnt = 0;
		days = 0;
		
	
		for(int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < col; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					chz.add(new int[] {i, j});
					cnt++;
				}
			}
		}
		
		while(cnt != 0) {
			days++;
			visited = new boolean[row][col];
			dfs(0, 0);
			
			/*
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}*/
			melt(chz);
			
			//System.out.println(cnt);
			
		}
		
		System.out.println(days);
		//System.out.println(cnt);
	}
	private static void melt(Queue<int[]> chz) {
		// TODO Auto-generated method stub
		
		while(!chz.isEmpty()) {
			int c[] = chz.poll();
			int x = c[0];
			int y = c[1];
			
			//System.out.print(x + " " + y + " ");
			//System.out.println();
			int tmp = 0;
			for(int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];
				

				if(nx < 0 || ny < 0 || nx >= row || ny >= col) {
					continue;
				}
				
				if(arr[nx][ny] == 2) {
					tmp++;
				}
				
			}
			
			if(tmp >= 2) {
				arr[x][y] = 0;
				//System.out.println(arr[x][y]);
				cnt--;
				//System.out.println(cnt);
			}
			
		}
		chz.clear();
		for(int i = 0; i < row; i++) {
			//st = new StringTokenizer(br.readLine());
			for(int j = 0; j < col; j++) {
				//arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) {
					chz.add(new int[] {i, j});
					//cnt++;
				}
			}
		}
			
	}
	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		visited[i][j] = true;
		arr[i][j] = 2;
		
		for(int k = 0; k < 4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			
			if(nx < 0 || ny < 0 || nx >= row || ny >= col) {
				continue;
			}
			if(visited[nx][ny] || arr[nx][ny] == 1) {
				continue;
			}
			
			dfs(nx, ny);
			
		}
		
	}
	
	
}