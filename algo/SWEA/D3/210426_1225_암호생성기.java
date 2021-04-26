package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SWEA_1225_암호생성기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			int T = sc.nextInt();
			int cnt = 0;
			int cycle = 0;
			Queue<Integer> password = new LinkedList<>();
			for (int i = 0; i < 8; i++) {
				password.add(sc.nextInt());
			}
			while (true) {
				cnt++;
				cycle++;
				if (cycle == 6) {
					cycle = 1;
					cnt = 1;
				}
				if (password.peek() - cnt <= 0) {
					password.poll();
					password.add(0);
					break;
				}
				int tmp = password.poll() - cnt;
				password.add(tmp);
			}
			System.out.print("#" + T);
			for (int i = 0; i < 8; i++) {
				System.out.print(" ");
				System.out.print(password.poll());
			}
			System.out.println();
		}
	}

}
