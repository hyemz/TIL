package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018_체스판다시칠하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] tmp1 = { 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' };
		char[] tmp2 = { 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		char pan[][] = new char[row][col];
		char tpan[][] = new char[8][8];
		char[] c = new char[row];
		int cnt = 0;
		int cnt2 = 0;
		int answer = Integer.MAX_VALUE;

		for (int i = 0; i < row; i++) {
			c = br.readLine().toCharArray();
			for (int j = 0; j < col; j++) {
				pan[i][j] = c[j];
			}
		}

//		System.out.println(pan[1]);

		for (int i = 0; i < row; i++) {
			c: for (int j = 0; j < col; j++) {
				for (int n = 0; n < 8; n++) {
					if (i + 8 > row)
						continue c;
					for (int m = 0; m < 8; m++) {
						if (j + 8 > col)
							continue c;
						tpan[n][m] = pan[n + i][m + j];
					}
				}

				cnt = 0;
				cnt2 = 0;
				for (int n = 0; n < 8; n++) {
					if (n % 2 == 0) {
						for (int k = 0; k < 8; k++) {
							if (tmp2[k] != tpan[n][k])
								cnt++;
							if (tmp1[k] != tpan[n][k])
								cnt2++;
						}
					}
					if (n % 2 != 0) {
						for (int k = 0; k < 8; k++) {
							if (tmp1[k] != tpan[n][k])
								cnt++;
							if (tmp2[k] != tpan[n][k])
								cnt2++;
						}
					}
				}
				cnt = Math.min(cnt2, cnt);
				answer = Math.min(answer, cnt);
			}
		}
		System.out.println(answer);
	}

}
