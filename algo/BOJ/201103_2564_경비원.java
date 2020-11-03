package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_2564_경비원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int store = sc.nextInt();
		int arr[] = new int[store + 1];
		int d = 2 * N + 2 * M;

		for (int i = 0; i <= store; i++) {
			int type = sc.nextInt();
			switch (type) {
			case 1: {
				arr[i] = sc.nextInt();
				continue;
			}
			case 2: {
				arr[i] = 2 * N + M - sc.nextInt();
				continue;
			}
			case 3: {
				arr[i] = 2 * N + 2 * M - sc.nextInt();
				continue;
			}
			case 4: {
				arr[i] = N + sc.nextInt();
				continue;
			}
			}
		}
//		for (int x : arr)
//			System.out.println(x);

		int total = 0, min = 0, tmp = 0;
		for (int i = 0; i < store; i++) {
			int person = arr[store];
			min = Math.abs(person - arr[i]);

			if (person > arr[i]) {
				tmp = arr[i] + (d - person);
			} else {
				tmp = (d - arr[i]) + person;
			}
			min = Math.min(min, tmp);
			total += min;
		}
		
		System.out.println(total);
	}

}
