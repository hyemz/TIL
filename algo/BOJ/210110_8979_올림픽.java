import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_8979_올림픽 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int score = 0;
		int cnt = 0;
		int answer = 1;

		int arr[][] = new int[N][5];
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			score = 0;
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				if (j == 4) {
					arr[i][j] = score;
					pq.add(score);
					continue;
				}
				if (j == 0) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}

				if (j == 1) {
					score += 100000 * Integer.parseInt(st.nextToken());
//					arr[i][j] = sc.nextInt();
				}
				if (j == 2) {
					score += 100 * Integer.parseInt(st.nextToken());
//					arr[i][j] = sc.nextInt();
				}
				if (j == 3) {
					score += Integer.parseInt(st.nextToken());
//					arr[i][j] = sc.nextInt();
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (arr[i][0] == K)
				cnt = arr[i][4];
		}

		while (!pq.isEmpty()) {
			if (pq.poll() == cnt) {
				break;
			}
			answer++;
		}
		System.out.println(answer);

	}

}
