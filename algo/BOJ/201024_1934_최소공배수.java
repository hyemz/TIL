package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_1934_최소공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = 0; 
			int n1 = a;
			int n2 = b;
			while(n2 % n1 != 0) {
				tmp = n2 % n1;
				n2 = n1; 
				n1 = tmp;
			}
			System.out.println(a/n1 * b/n1 * n1);
		}
	}

}
