

import java.util.Scanner;

public class BOJ_10974_모든순열 {
	static int out[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		out = new int[N];
		boolean visit[] = new boolean[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

//		for(int s: arr) {
//			System.out.println(s);
//		}

		permutation(arr, visit, 0, N);
	
	}

	private static void permutation(int[] arr, boolean[] visit, int depth, int N) {
		// TODO Auto-generated method stub
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(out[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < arr.length; ++i) {
			if (visit[i])
				continue;
			
			out[depth] = arr[i];
			visit[i] = true;
			permutation(arr, visit, depth + 1, N);
			visit[i] = false;
		}

	}

}
