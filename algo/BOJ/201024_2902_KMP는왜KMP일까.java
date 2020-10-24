package com.ssafy.practice;

import java.util.Scanner;

public class BOJ_2902_KMP는왜KMP일까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		char [] carr = c.toCharArray();

		System.out.print(carr[0]);
		for(int i = 0; i < carr.length; i++) {
			if(carr[i] == '-') {
				System.out.print(carr[i+1]);
			}
		}
	}

}
