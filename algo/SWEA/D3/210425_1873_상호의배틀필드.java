package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1873_상호의배틀필드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int T = 1; T <= t; T++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int row = Integer.parseInt(st.nextToken());
			int col = Integer.parseInt(st.nextToken());

			char field[][] = new char[row][col];
			int start_i = 0;
			int start_j = 0;
			int start_d = 0;
			int start_n = 0; // 타입

			for (int i = 0; i < row; i++) {
				String s = br.readLine();
				for (int j = 0; j < col; j++) {
					field[i][j] = s.charAt(j);
					if (s.charAt(j) == '^') {
						start_i = i;
						start_j = j;
						start_d = -1;
						start_n = 1;
					}
					if (s.charAt(j) == 'v') {
						start_i = i;
						start_j = j;
						start_d = 1;
						start_n = 1;
					}
					if (s.charAt(j) == '<') {
						start_i = i;
						start_j = j;
						start_d = -1;
						start_n = 2;
					}
					if (s.charAt(j) == '>') {
						start_i = i;
						start_j = j;
						start_d = 1;
						start_n = 2;
					}
				}
			}

			int num = Integer.parseInt(br.readLine());
			String attack = br.readLine();
			for (int i = 0; i < num; i++) {
				if (attack.charAt(i) == 'S') {
					int nx = start_i;
					int ny = start_j;
					switch (start_n) {
					case 1:
						while (true) {
							nx += start_d;
							if (nx < 0 || nx >= row)
								break;
							if (field[nx][start_j] == '#') {
								break;
							}
							if (field[nx][start_j] == '*') {
								field[nx][start_j] = '.';
								break;
							}
						}
						break;
					case 2:
						while (true) {
							ny += start_d;
							if (ny < 0 || ny >= col)
								break;
							if (field[start_i][ny] == '#') {
								break;
							}
							if (field[start_i][ny] == '*') {
								field[start_i][ny] = '.';
								break;
							}
						}
						break;
					}
				}
				if (attack.charAt(i) == 'U') {
					start_d = -1;
					start_n = 1;
					field[start_i][start_j] = '^';
					if (start_i - 1 >= 0 && field[start_i + start_d][start_j] == '.') {
						field[start_i + start_d][start_j] = field[start_i][start_j];
						field[start_i][start_j] = '.';
						start_i += start_d;
					}
				}
				if (attack.charAt(i) == 'D') {
					start_d = 1;
					start_n = 1;
					field[start_i][start_j] = 'v';
					if (start_i + 1 < row && field[start_i + start_d][start_j] == '.') {
						field[start_i + start_d][start_j] = field[start_i][start_j];
						field[start_i][start_j] = '.';
						start_i += start_d;
					}
				}
				if (attack.charAt(i) == 'L') {
					start_d = -1;
					start_n = 2;
					field[start_i][start_j] = '<';
					if (start_j - 1 >= 0 && field[start_i][start_j + start_d] == '.') {
						field[start_i][start_j + start_d] = field[start_i][start_j];
						field[start_i][start_j] = '.';
						start_j += start_d;
					}
				}
				if (attack.charAt(i) == 'R') {
					start_d = 1;
					start_n = 2;
					field[start_i][start_j] = '>';
					if (start_j + 1 < col && field[start_i][start_j + start_d] == '.') {
						field[start_i][start_j + start_d] = field[start_i][start_j];
						field[start_i][start_j] = '.';
						start_j += start_d;
					}
				}
			}
			System.out.print("#" + T + " ");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(field[i][j]);
				}
				System.out.println();
			}
		}
	}

}
