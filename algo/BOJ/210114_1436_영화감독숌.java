import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436_영화감독숌 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 665;
		int count = 0;
		String s;

		while (true) {
			cnt++;
			s = Integer.toString(cnt);
			if (s.contains("666")) {
				count++;
			}
			if (count == N) {
				System.out.println(cnt);
				break;
			}
		}
	}
}
