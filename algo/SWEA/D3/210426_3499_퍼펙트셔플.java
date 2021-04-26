package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_3499_퍼펙트셔플 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			Queue<String> card = new LinkedList<>();
			Queue<String> card_2 = new LinkedList<>();
			int num = sc.nextInt();
			int cnt = 0;

			for (int i = 0; i < num; i++) {
				if (num % 2 == 0) {
					if (num / 2 > i) {
						card.add(sc.next());
					} else {
						card_2.add(sc.next());
					}
				}
				if (num % 2 == 1) {
					if (num / 2 + 1 > i) {
						card.add(sc.next());
					} else {
						card_2.add(sc.next());
					}
				}
			}
			System.out.print("#" + t);
			while (!card_2.isEmpty() && !card.isEmpty()) {
				System.out.print(" ");
				System.out.print(card.poll());
				System.out.print(" ");
				System.out.print(card_2.poll());
			}
			if (num % 2 == 1) {
				System.out.print(" " + card.poll());
			}
			System.out.println();
		}
	}

}
