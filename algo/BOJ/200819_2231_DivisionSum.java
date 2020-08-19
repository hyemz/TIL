
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2231_DivisionSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String m = br.readLine();
		int M = Integer.parseInt(m);

		int sum;
		int min = 0;
		for (int i = 1; i <= 9 * m.length(); i++) {
			int N = M - i;
			sum = 0;
			String s = Integer.toString(N);
			for (int j = 0; j < s.length(); j++) {
				sum += s.charAt(j) - '0';
			}
			if (M == N + sum) {
				min = N;
			}
		}
		System.out.println(min);

	}

}
