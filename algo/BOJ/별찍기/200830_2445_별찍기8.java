package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_200830_2445_별찍기8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = i + 2; j < 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j <= 2 * i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
