package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1210_Ladder1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dx[] = { 0, 0 };
		int dy[] = { -1, 1 };
		for (int t = 1; t <= 10; t++) {
			int T = Integer.parseInt(br.readLine());
			int answer = 0;
			int ladder[][] = new int[100][100];
			int start_j = 0;
			int start_i = 99;

			// 배열에 저장
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					int tmp = Integer.parseInt(st.nextToken());
					ladder[i][j] = tmp;
					if (tmp == 2) {
						start_j = j;
					}
				}
			}

			// 탐색
			int flag = 2;
			while (true) {
				if (start_i == 0) {
					answer = start_j;
					break;
				}

				// 위쪽
				if (flag == 2) {
					start_i -= 1;
					for (int k = 0; k < 2; k++) {
						int ny = start_j + dy[k];
						if (ny == -1 || ny == 100 || ladder[start_i][ny] == 0) {
							continue;
						}
						flag = k;
					}
				}

				// 왼쪽 혹은 오른쪽
				else {
					if (flag == 0) {
						int ny = start_j - 1;
						if (ny == -1 || ladder[start_i][ny] == 0) {
							flag = 2;
							continue;
						}
						start_j = ny;
					} else if (flag == 1) {
						int ny = start_j + 1;
						if (ny == 100 || ladder[start_i][ny] == 0) {
							flag = 2;
							continue;
						}
						start_j = ny;
					}
				}
			}
			System.out.println("#" + T + " " + answer);
		}
	}
}