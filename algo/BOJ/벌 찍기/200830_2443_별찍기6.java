package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_200830_2443_별찍기6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 2; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 2*n - 1; j >= 2*i - 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
