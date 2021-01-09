import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_10818_최소최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			int M = sc.nextInt();
			pq.add(M);
			pq2.add(M);
		}
		System.out.print(pq.poll() + " ");
		System.out.println(pq2.poll());
	}

}
