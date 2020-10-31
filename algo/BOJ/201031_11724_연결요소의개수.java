package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_11724_연결요소의개수 {
	static int visit[], N, M;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int cnt = 1;
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		LinkedList<Integer>[] list = new LinkedList[N + 1];
		visit = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			list[i] = new LinkedList<>();
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s1 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());
			list[s1].add(s2);
			list[s2].add(s1);
		}

		for (int i = 1; i <= N; i++) {
			if (list[i].size() == 0) {
				cnt++;
				continue;
			}
			if (visit[list[i].get(0)] == 0)
				dfs(list, i, cnt++);
		}
		System.out.println(cnt - 1);

	}

	private static void dfs(LinkedList<Integer>[] list, int i, int cnt) {
		// TODO Auto-generated method stub
		for (int k = 0; k < list[i].size(); k++) {
			if (visit[list[i].get(k)] == 0) {
				visit[list[i].get(k)] = cnt;
				dfs(list, list[i].get(k), cnt);
			}
		}

	}

}
