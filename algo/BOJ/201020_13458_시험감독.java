

import java.util.Scanner;

public class BOJ_13458_시험감독 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int room[] = new int [N];

		for(int i = 0; i < N; i++) {
			room[i] = sc.nextInt();
		}
//		System.out.println();
//		for(int x: room) {
//			System.out.print(x);
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		long cnt = 0;
		for(int i = 0; i < N; i++) {
			int temp = room[i] - a;
			cnt++;
			if (temp <= 0) continue;
			if(temp % b == 0) {
				cnt += temp / b;
			} 
			if (temp % b != 0)
				cnt += temp /b + 1;
		}
		System.out.println(cnt);
	}

}
