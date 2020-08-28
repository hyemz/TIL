
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3234_준환이의양팔저울 {
	static int chuCnt;
	static int cnt, sum;
	static int n[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			chuCnt = Integer.parseInt(br.readLine());
			n = new int[chuCnt];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int c = 0; c < chuCnt; c++) {
				n[c] = Integer.parseInt(st.nextToken());
			}
			cnt = 0;
			permutation(0, chuCnt, chuCnt);
			System.out.print("#" + t + " " + cnt);
			System.out.println();
		}
	}

	private static void permutation(int depth, int n, int r) {
		// TODO Auto-generated method stub
		if (depth == r) {
			dfs(0, 0, 0);
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(depth, i);
			permutation(depth + 1, n, r);
			swap(depth, i);
		}

	}

	private static void dfs(int depth, int left, int right) {
		// TODO Auto-generated method stub
		if (depth == chuCnt) {
			cnt++;
			return;
		}
		sum = left + n[depth];
		dfs(depth + 1, sum, right);
		sum = right + n[depth];
		if (sum <= left) {
			dfs(depth + 1, left, sum);
		}

	}

	private static void swap(int depth, int i) {
		// TODO Auto-generated method stub
		int temp = n[depth];
		n[depth] = n[i];
		n[i] = temp;
	}

}
