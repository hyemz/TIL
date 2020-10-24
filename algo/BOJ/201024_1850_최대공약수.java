package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_1850_최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
	
//		System.out.println(n2-n1);
		
		
		long tmp = 0; 
		
		while(n2%n1 !=0) {
			tmp = n2%n1;
			n2 = n1;
			n1 = tmp;
		}
//		System.out.println(n1);
		StringBuilder sb = new StringBuilder();
	
		for(int i = 1; i <= n1; i++) {
			sb.append("1");
		}
		System.out.println(sb);
	}

}
