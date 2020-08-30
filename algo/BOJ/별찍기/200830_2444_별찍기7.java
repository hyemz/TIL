package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_200830_2444_별찍기7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2 * n - 1; j >= 2 * i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
