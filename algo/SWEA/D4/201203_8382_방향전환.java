

import java.util.Scanner;

public class SWEA_8382_방향전환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 1; t <= T; t++) {
			int answer = 0;
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			int cx = Math.abs(x2 - x1);
			int cy = Math.abs(y2 - y1);

			if (Math.abs(cx-cy) % 2 == 1) {
				answer = 2 * Math.max(cx, cy) - 1;
			} else
				answer = 2 * Math.max(cx, cy);

			System.out.println("#" + t + " " + answer);
		}
	}

}
