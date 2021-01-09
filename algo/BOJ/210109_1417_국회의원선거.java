import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_1417_국회의원선거 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int rm = 0;
		int cnt = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < N; i++) {
			if(i == 0) {
				rm = sc.nextInt();
			} else {
				pq.add(sc.nextInt());
			}
		}
		
		while(!pq.isEmpty()) {
			if(pq.peek() >= rm) {
				int tmp = pq.poll();
				cnt++;
				rm++;
				pq.add(tmp-1);
			}
			else {
				pq.poll();
			}
		}
		System.out.println(cnt);
	}

}
