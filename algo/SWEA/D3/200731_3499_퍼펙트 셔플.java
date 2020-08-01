
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PerfectS {
	static int T, N;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		Queue<String> q2 = new LinkedList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N / 2; i++) {
				String s = st.nextToken();
				q.offer(s);
			}
			if (N % 2 == 1) {
				String s = st.nextToken();
				q.offer(s);
			}

			for (int i = 0; i < N / 2; i++) {
				String s = st.nextToken();
				q2.offer(s);
			}
			System.out.print("#" + t + " ");
			for (int i = 0; i < N / 2; i++) {
				System.out.print(q.poll() + " ");

				System.out.print(q2.poll() + " ");
			}
			if (q.peek() != null) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
		}
	}

}
