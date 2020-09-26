package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966_PrintQueue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int max = 0, tmp = 0, poll = 0;

		for (int t = 1; t <= T; t++) {
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			Queue<Integer> q = new LinkedList<Integer>();

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for (int n = 0; n < N; n++) {
				tmp = Integer.parseInt(st.nextToken());
				pq.add(tmp);
				q.add(tmp);
			}
			int cnt = 0;
			while (!q.isEmpty()) {
				if (idx == -1)
					break;
				max = pq.peek();
				poll = q.poll();
				if (poll < max) {
					q.add(poll);
					if (idx == 0) {
						idx = pq.size() - 1;
					} else
						idx--;
				} else {
					pq.poll();
					idx--;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
