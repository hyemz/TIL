package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_1316_그룹단어체커 {
	static boolean visit[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] c = new char[101];
		int answer = 0;
		for (int i = 0; i < N; i++) {
			visit = new boolean[100];
			c = br.readLine().toCharArray();
			if (check(c))
				answer++;
//			System.out.println('a' - '0');
		}
		System.out.println(answer);
	}

	private static boolean check(char[] c) {
		// TODO Auto-generated method stub
		for (int i = 0; i < c.length; i++) {

			if (!visit[c[i] - '0']) {
				visit[c[i] - '0'] = true;
				continue;
			}

			if (i != 0 && visit[c[i] - '0']) {
				if (c[i - 1] != c[i]) {
					return false;
				}
			}
		}
		return true;
	}

}
