package day0728;

import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] box = new int[N][N];
		int sum = 0;

		int dx[] = { 1, 0, -1, 0 }; // 우 상 좌 하
		int dy[] = { 0, -1, 0, 1 };

		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				box[i][j] = (int) (Math.random() * 50) + 1;
			}
		}

		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				System.out.print(box[i][j] + " ");
			}
			System.out.println(" ");
		}

		int nexty = 0;
		int nextx = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < 4; k++) {
					nextx = i + dx[k];
					nexty = j + dy[k];
					if (nexty >= N || nexty < 0 || nextx >= N || nextx < 0) {
						continue;
					}

					sum += Math.abs(box[nextx][nexty] - box[i][j]);
				}
			}
		}

		System.out.println(sum);

	}

}
