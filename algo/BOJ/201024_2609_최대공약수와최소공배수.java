package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_2609_최대공약수와최소공배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int tmp = 0;
		int a = n1; 
		int b = n2;
		// 최대 공약수
		while (a % b != 0) {
			tmp = b % a;
			b = a;
			a = tmp;
		}
		System.out.println(b);
		System.out.println(n1/b * n2/b * b);
		

	}

}
