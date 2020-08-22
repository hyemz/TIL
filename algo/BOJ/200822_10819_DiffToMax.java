
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10819_DiffToMax {
	static int max = 0;
	static int n[] = null;
	static int N = 0;
	static int sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		n = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			n[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			permutation(n, i, N, N);
		}
		System.out.println(max);
		
	}

	static void permutation(int[] n, int depth, int N, int r) {
		if (depth == r) {
			sum = 0;
			for (int i = 0; i < N - 1; i++) {
				sum += Math.abs(n[i] - n[i + 1]);
			}
			if(sum > max) max = sum;
			return ;
		}

		for (int i = depth; i < N; i++) {
			swap(n, depth, i);
			permutation(n, depth + 1, N, r);
			swap(n, depth, i);
		}
	}

	static void swap(int[] n, int depth, int i) {
		int temp = n[depth];
		n[depth] = n[i];
		n[i] = temp;
	}
	
//	static void test() {
//		for (int i = 0; i < N - 1; i++) {
//			if (Math.abs(n[i] - n[i + 1]) > max) {
//				max = Math.abs(n[i] - n[i + 1]);
//			}
//
//		}
//	}

}
