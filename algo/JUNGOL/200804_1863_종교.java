
import java.util.Scanner;

public class religion {
	static int n[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		n = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			n[i] = i;
		}

		int M = sc.nextInt();
		int cnt = N;
		for (int i = 0; i < M; i++) {
			int one = find(sc.nextInt());
			int two = find(sc.nextInt());

			if (one != two) {
				n[two] = one;
				cnt--;
			}
		}
		System.out.println(cnt);
	}

	static int find(int a) {
		if (n[a] == a)
			return a;
		return n[a] = find(n[a]);
	}

}
