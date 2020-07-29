import java.util.Scanner;

public class SWEA_1873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		char ground[] = { '.', '*', '#', '-'};
		char dir [] = {'^', 'v', '<', '>' };
		char play[] = { 'U', 'D', 'L', 'R' ,'S'};

		
		int [] dx = {0, 0, -1, 1 }; // 상 하 좌 우
		int [] dy = {-1, 1, 0, 0 };
		int d = 0;
		int x=0, y=0;
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			char map[][] = new char[N][M];
			int cur [];
			int a = 0;

			// map 채우기
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					String s = sc.nextLine();
					map[i][j] = s.charAt(0);
				}
			}
			
			for(int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j]==(dir[0]) || map[i][j]==dir[1]
							|| map[i][j]==dir[2] || map[i][j]==dir[3]) {
						x = i;
						y = j;
					}
				}
			}
					
			
			System.out.println(x);
			System.out.println(y);
			
			// 문자열 배열 하나씩 저장하기
			int num = sc.nextInt();
			String[] info = sc.next().split("");
//
//			// 전차의 움직임
//			int nx = x + dx[d];
//			int ny = y + dy[d];
//			for(int i = 0; i < num; i++) {
//				for (int a = x; x < N; x++) {
//					for (int b = y; y < M; y++) {
//						if(info[i].equals(play[0])) {
//							map[x][y] = dir[0];
//						}
//					}
//				}
//				if (info[i].equals("S")) {
//					for (int a = 0; a < 4; i++) {
//					if(map[x][y] == dir[a]) d = a;
//					}
//				
//					
//					for 
//					if (map[nx][ny].equals("*")) {
//					nx = x + dx[d];
//					ny = y + dy[d];
//					}
//				}
//				
//				// 상
//				if (info[i].equals("U")) {
//					d = 0;
//					if (map[nx][ny].equals(ground[1])){
//						continue;
//					}
//					if (map[nx][ny].equals(ground[0])) {
//					map[nx][ny] = map[x][y];
//					map[x][y] = dir[d];
//					}
//					x = nx;
//					y = ny;
//					nx = x + dx[d];
//					ny = y + dy[d];
//					break;
//				} 
//				
//				// 하
//				if (info[i].equals("D")) {
//					d = 1;
//					if (map[nx][ny].equals(ground[1])){
//						continue;
//					}
//					if (map[nx][ny].equals(ground[0])) {
//					map[nx][ny] = map[x][y];
//					map[x][y] = dir[d];
//					}
//					x = nx;
//					y = ny;
//					nx = x + dx[d];
//					ny = y + dy[d];
//					break;
//				}
//
//				// 좌
//				if (info[i].equals("L")) {
//					d = 2;
//					if (map[nx][ny].equals(ground[1])){
//						continue;
//					}
//					if (map[nx][ny].equals(ground[0])) {
//					map[nx][ny] = map[x][y];
//					map[x][y] = dir[d];
//					}
//					x = nx;
//					y = ny;
//					nx = x + dx[d];
//					ny = y + dy[d];
//					break;
//				}
//				
//				// 우
//				if (info[i].equals("R")) {
//					d = 3;
//					if (map[nx][ny].equals(ground[1])){
//						continue;
//					}
//					if (map[nx][ny].equals(ground[0])) {
//					map[nx][ny] = map[x][y];
//					map[x][y] = dir[d];
//					}
//					x = nx;
//					y = ny;
//					nx = x + dx[d];
//					ny = y + dy[d];
//					break;
//				}
//			}
//			
			
		}
	}

}
