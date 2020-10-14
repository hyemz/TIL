

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_18429_근손실 {

	public static int w = 500;
	public static int cnt = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();
		int k = sc.nextInt();
		int plan[] = new int[day];

		for (int i = 0; i < day; i++) {
			plan[i] = sc.nextInt();
		}
		permutation(plan, 0, k);
		System.out.println(cnt);
	}

	private static void permutation(int[] plan, int index, int k) {
		if (index >= plan.length) {
			w = 500;
			for(int i = 0; i < index; i++) {
				w += plan[i] - k;
				if(w < 500) break;
			}
//			System.out.println(w);
			if(w >= 500) cnt++;
//			System.out.println(Arrays.toString(plan));
			return;
		}
		for (int i = index; i < plan.length; i++) {
			swap(index, i, plan);
			permutation(plan, index + 1, k);
			swap(index, i, plan);
		}
	}

	private static void swap(int a, int b, int[] plan) {
		int temp = plan[a];
		plan[a] = plan[b];
		plan[b] = temp;
	}

}
