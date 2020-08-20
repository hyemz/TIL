
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3040_SevenNajang {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sv[] = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int a = Integer.parseInt(br.readLine());
			sv[i] = a;
			sum += a;
		}
		int s = sum - 100;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sv[i] + sv[j] == s) {
					sv[i] = -1;
					sv[j] = -1;
					break;
				}
			}
		}

		for (int x : sv) {
			if (x != -1) {
				System.out.println(x);
			}
		}
	}

}
