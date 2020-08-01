package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1204_최빈수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int score[] = new int[101];
			// int num = sc.nextInt();
//			String N = br.readLine();
//			System.out.println(N);
			StringTokenizer st = new StringTokenizer(br.readLine());
////			System.out.println(st.nextToken());
			StringTokenizer stt = new StringTokenizer(br.readLine());
//			System.out.println(stt.nextToken());
//			System.out.println(stt.nextToken());
			for (int i = 1; i <= 1000; i++) {
				int a = Integer.parseInt(stt.nextToken());
				score[a] = score[a] + 1;
			}

//			for (int i = 0; i < score.length; i++) {
//				System.out.print(i + ": " + score[i] + " ");
//			}
//			System.out.println();

			int b = 0;
			int c = 0;
			for (int i = 0; i < score.length; i++) {
//				b = score[0];
				if (b > score[i]) {
					continue;
				}
				c = i;
				b = score[i];

			}
			System.out.println("#" + t + " " + c);
		}
	}

}
