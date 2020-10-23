

import java.util.Scanner;

public class BOJ_2167_2차원배열의합 {
	static int answer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[N+1][M+1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int K = sc.nextInt();
		for (int k = 1; k <= K; k++) {
			answer = 0;
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			for (int i = s1; i <= e1; i++) {
				for (int j = s2; j <= e2; j++) {
					answer += arr[i][j];
				}
			}
			System.out.println(answer);
		}
	}

}
