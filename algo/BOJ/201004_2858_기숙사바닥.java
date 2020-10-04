

import java.util.Scanner;

public class BOJ_2858_DormBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int brown = sc.nextInt();
		int size = red + brown;

		int w = 0, l = 0;

		for (int i = 3; i < red; i++) {
			for (int j = 3; j < red; j++) {
				if (red == 2 * (i + j) - 4 && size == i * j) {
					w = i;
					l = j;
					break;
				}
			}
		}
		w = Math.min(w, l);
		l = size / w;
		System.out.println(l + " " + w);
	}

}
