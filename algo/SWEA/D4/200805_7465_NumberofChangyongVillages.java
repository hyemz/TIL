
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.StringTokenizer;

public class Changyong {
	static int n[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
//			int N = sc.nextInt();
//			int M = sc.nextInt();
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			n = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				n[i] = i;
			}

			int cnt = N;
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int one = find(Integer.parseInt(st.nextToken()));
				int two = find(Integer.parseInt(st.nextToken()));

				if (one != two) {
					n[two] = one;
					cnt--;
				}
			}
			System.out.print("#" + t + " " + cnt);
			System.out.println();
		}
	}

	static int find(int a) {
		if (n[a] == a)
			return a;
		return n[a] = find(n[a]);
	}

}
