package algorithm;

import java.util.Scanner;

public class SWEA_1289_원재의메모리복구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int T = 1; T <= t; T++) {
			String s = sc.next();
			int length = s.length();
			int count = 0;
			char tmp = '0';

			for (int i = 0; i < length; i++) {
				if (s.charAt(i) != tmp) {
					count++;
					tmp = s.charAt(i);
				}
			}
			
			System.out.println("#" + T + " " + count);
		}
	}

}
