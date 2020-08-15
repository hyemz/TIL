
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748_ConnectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		int t = Integer.parseInt(T);
		int num = 0;
		StringBuilder sb = new StringBuilder();

		switch (T.length()) {
		case 1: {
			num = 9 * 1 - Integer.parseInt(T) + 1;
			break;
		}
		case 2: {
			num = 9 * 1 + (t - 9) * 2;
			break;
		}
		case 3: {
			num = 9 * 1 + 90 * 2 + (t - 99) * 3;
			break;
		}
		case 4: {
			num = 9 * 1 + 90 * 2 + 900 * 3 + (t - 999) * 4;
			break;
		}
		case 5: {
			num = 9 * 1 + 90 * 2 + 900 * 3 + 9000 * 4 + (t - 9999) * 5;
			break;
		}
		case 6:
			num = 9 * 1 + 90 * 2 + 900 * 3 + 9000 * 4 + 90000 * 5 + (t - 99999) * 6;
			break;
		case 7:
			num = 9 * 1 + 90 * 2 + 900 * 3 + 9000 * 4 + 90000 * 5 + 900000 * 6 + (t - 999999) * 7;
			break;
		case 8:
			num = 9 * 1 + 90 * 2 + 900 * 3 + 9000 * 4 + 90000 * 5 + 900000 * 6 + 9000000 * 7 + (t - 9999999) * 8;
			break;
		case 9:
			num = 9 * 1 + 90 * 2 + 900 * 3 + 9000 * 4 + 90000 * 5 + 900000 * 6 + 9000000 * 7 + 90000000 * 8
					+ (t - 99999999) * 9;
			break;
		}

		System.out.println(num);

	}

}
