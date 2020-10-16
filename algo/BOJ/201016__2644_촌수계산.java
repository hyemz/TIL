package com.ssafy.practice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2644_촌수계산 {
	static boolean visited[];
	static int num = 0;
	static int pNum;
	static int rNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		pNum = sc.nextInt(); // 전체 사람 수
		int aPerson = sc.nextInt(); // 첫번째 사람
		int bPerson = sc.nextInt(); // 두번째 사람
		rNum = sc.nextInt(); // 관계 수 
		
		LinkedList<Integer> [] list = new LinkedList[pNum + 1];
		visited = new boolean[pNum+1];
		
		for(int i = 0; i <= pNum; i++) {
			list[i] = new LinkedList<Integer>();
		}
		
		for(int i = 0; i < rNum; i++) {
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			list[p1].add(p2);
			list[p2].add(p1);
		}
		
		for(int i = 1; i <= pNum; i++) {
            Collections.sort(list[i]);
        }
		
		int cnt = 0;
		boolean flag = false;
//		a = Math.min(aPerson, bPerson);
//		b = Math.max(aPerson, bPerson);
		dfs(aPerson, bPerson, list, cnt, flag);
//		System.out.println(flag);
//		System.out.println(num);
		if(num == 0) System.out.println(-1);
		
	}

	private static int dfs(int a, int b, LinkedList<Integer>[] list, int cnt, boolean flag) {
		// TODO Auto-generated method stub
		visited[a] = true;
//		System.out.println("정점" + " "+ a);
		if(a == b) {
			System.out.println(cnt);
			num = cnt;
			flag = true;
		}
//		else if (cnt == pNum && a != b) System.out.println(-1);
		cnt++;
		
		for(int e: list[a]) {
			if (!visited[e])
				dfs(e, b, list, cnt, flag);
		}
		return num;
	}

}
