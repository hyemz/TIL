package com.ssafy.practice;

import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10757_큰수A더하기B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String arr[] = new String[2];

		arr[0] = st.nextToken();
		arr[1] = st.nextToken();

		System.out.println(new BigInteger(arr[0]).add(new BigInteger(arr[1])));
	}

}
