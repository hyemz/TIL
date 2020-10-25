package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_9012_괄호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			Queue<Character> q = new LinkedList<>();
			Queue<Character> q2 = new LinkedList<>();
			char[] c = new char[50];
			c = br.readLine().toCharArray();
			int acnt = 0;
			int bcnt = 0;
			boolean flag = false;
//			System.out.println(c);
//			System.out.println(c[2]);
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '(') {
					q.add(c[j]);
					acnt++;
				}
				if (c[j] == ')') {
					q.poll();
					if (q.isEmpty())
						q2.add(c[j]);
//					System.out.println(q);
					bcnt++;
				}
			}
			if (q.isEmpty()) {
				flag = true;
			}

			if (acnt == bcnt && flag)
				System.out.println("YES");
			if (acnt != bcnt || !flag)
				System.out.println("NO");
		}
	}

}
