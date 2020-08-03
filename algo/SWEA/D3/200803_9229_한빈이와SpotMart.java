package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpotMartWithHanbin {
	static int N, max;
	static int M;
	static int cnt[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
//		System.out.println(T);
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			cnt = new int[N];
			M = Integer.parseInt(st.nextToken());
//			System.out.println(N);
//			System.out.println(M);

			StringTokenizer stt = new StringTokenizer(br.readLine());
			for (int i = 0; i < cnt.length; i++) {
				cnt[i] = Integer.parseInt(stt.nextToken());
			}
//			for(int x: cnt) {
//				System.out.println(x);
//			}

			max = -1;
			for (int i = 0; i < N; ++i) {
				for (int j = 1; i + j < N; ++j) {
					int sum = cnt[i] + cnt[i + j];
					if (sum > M) {
						continue;
					}
					if (sum <= M && sum >= max) {
						max = sum;
//						System.out.println(max);
					}

				}
			}
			System.out.print("#" + t + " " + max);
			System.out.println();
		}
	}

}
