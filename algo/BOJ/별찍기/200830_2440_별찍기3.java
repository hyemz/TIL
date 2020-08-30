package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_200830_2438_별찍기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
