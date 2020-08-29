package com.ssafy.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872_팩토리얼 {
static int N, answer = 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		recursion(1, N);
		System.out.println(answer);
	}
	private static void recursion(int depth, int n2) {
		// TODO Auto-generated method stub
		if(depth > n2) {
			return;
		}
		
		answer *= depth;
		recursion(depth+1, n2);
	}

}
