package algorithm;

import java.util.Scanner;

public class SWEA_1861_정사각형방 {
static int dx[] = {0, 0, 1, -1};
static int dy[] = {-1, 1, 0, 0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int room[][] = new int[n][n];
			int tmp = 0; // 현재 위치의 값
			int cnt = 0; // 이동한 횟수
			int maxCnt = 0; // 최대 이동 횟수 
			int max = 0; // 최대로 이동한 방의 값
			
			// 방의 값을 저장
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					room[i][j] = sc.nextInt();
				}
			}
			
			// 모든 방을 들린다.
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n; j++) {
					cnt = 0;
					boolean flag = true;
					
					// 해당 값을 tmp에 넣는다. 
					tmp = room[i][j];
					
					int si = i;
					int sj = j;
					
					d: while(flag) {
						// 4방탐색해서 갈 곳 있나 보기
						c: for(int k = 0; k < 4; k++) {
							int di = si + dx[k];
							int dj = sj + dy[k];
							
							if(dj < 0 || di < 0 || dj >= n || di >= n) {
								if(k == 3) {
									flag = false;
									break d;
								}
								continue c; 
							}
							// 현재 위치보다 +1 큰 값 있는지 확인
							if(room[di][dj] == room[si][sj] + 1) {
								si = di;
								sj = dj;
								cnt++;
								break c;
							}
							
							if(k == 3) {
								flag = false;
								break d;
							}
							
						}
					}
					
					// 더이상 나아갈 수 없을 때, maxCnt와 Cnt를 비교한다.
					if(maxCnt > cnt) {
						continue;
					}
					else if (maxCnt < cnt) {
						maxCnt = cnt;
						max = tmp;
					}
					else {
						if(max > tmp) max = tmp;
					}
					
				}
			}
			
			// 답 출력
			System.out.print("#" + t + " " + max + " ");
			System.out.println(maxCnt + 1);
		}
	}
}
