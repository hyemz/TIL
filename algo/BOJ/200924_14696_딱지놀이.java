package com.ssafy.practice;

import java.util.Scanner;

public class 딱지놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int aNum = 0;
		int bNum = 0;
		int temp = 0;
//				o=0, t=0, tt=0, f=0;
		for (int i = 0; i < N; i++) {
			int a[] = new int[4];
			int b[] = new int[4];
			aNum = sc.nextInt();
			for (int aa = 0; aa < aNum; aa++) {
				temp = sc.nextInt();
				if (temp == 1)
					a[temp - 1]++;
				if (temp == 2)
					a[temp - 1]++;
				if (temp == 3)
					a[temp - 1]++;
				if (temp == 4)
					a[temp - 1]++;
			}

			bNum = sc.nextInt();
			for (int bb = 0; bb < bNum; bb++) {
				temp = sc.nextInt();
				if (temp == 1)
					b[temp - 1]++;
				if (temp == 2)
					b[temp - 1]++;
				if (temp == 3)
					b[temp - 1]++;
				if (temp == 4)
					b[temp - 1]++;
			}

//			System.out.println(a[3]);

			if (b[3] < a[3]) {
				System.out.println("A");
			} else if (b[3] == a[3]) {
				if (b[2] < a[2]) {
					System.out.println("A");
				} else if (b[2] == a[2]) {
					if (b[1] < a[1]) {
						System.out.println("A");
					} else if (b[1] == a[1]) {
						if (b[0] < a[0]) {
							System.out.println("A");
						} else if (b[0] == a[0]) {
							System.out.println("D");
						}
					}
				}
			}

			if (b[3] > a[3]) {
				System.out.println("B");
			} else if (b[3] == a[3]) {
				if (b[2] > a[2]) {
					System.out.println("B");
				} else if (b[2] == a[2]) {
					if (b[1] > a[1]) {
						System.out.println("B");
					} else if (b[1] == a[1]) {
						if (b[0] > a[0]) {
							System.out.println("B");
						}
					}
				}
			}
		}
	}

}
