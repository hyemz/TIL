package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P01 {
	public static void main(String args[]) throws Exception {
		int N[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T;
		int sum = 0;
		T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int M = Integer.parseInt(br.readLine());
			for (int i = 0; i < M; i++) {

				if (N[i] % 2 == 0) {
					sum -= N[i];
				} else
					sum += N[i];
			}

			System.out.println("#" + test_case + " " + sum);
			sum = 0;

		}
	}
}