package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_200830_2441_별찍기4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
