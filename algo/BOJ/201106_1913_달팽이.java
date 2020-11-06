import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1913_달팽이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());
		int max = N * N;
		int a = 0;
		int b = 0;

		int snail[][] = new int[N][N];
		boolean visit[][] = new boolean[N][N];

		int k = 0;
		int kk = 1;
		while (max >= 1) {
			for (int i = k; i < N; i++) {
				if (visit[i][k])
					continue;
				visit[i][k] = true;
				snail[i][k] = max--;
			}
			for (int j = k; j < N; j++) {
				if (visit[N - 1 - k][j])
					continue;
				visit[N - 1 - k][j] = true;
				snail[N - 1 - k][j] = max--;
			}
			for (int i = N - 1 - k; i >= 0; i--) {
				if (visit[i][N - 1 - k])
					continue;
				visit[i][N - 1 - k] = true;
				snail[i][N - 1 - k] = max--;
			}
			for (int j = N - 1 - k; j >= 0; j--) {
				if (visit[k][j])
					continue;
				visit[k][j] = true;
				snail[k][j] = max--;
			}
			k++;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(snail[i][j] + " ");
				if (snail[i][j] == num) {
					a = i + 1;
					b = j + 1;
				}
			}
			System.out.println();
		}

		System.out.println(a + " " + b);
	}

}
