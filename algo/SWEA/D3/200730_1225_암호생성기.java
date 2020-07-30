import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		int T;
		for (int b = 1; b <= 10; b++) {
			T = sc.nextInt();
			int cnt = 1;
			int M = 0;

			// queue에 넣기
			for (int i = 0; i < 8; i++) {
				int N = sc.nextInt();
				q.offer(N);
			}

//			q.poll();
//			q.poll();
//			q.poll();
//			q.poll();
//			q.poll();
//			q.poll();
//			q.poll();
//			q.poll();

			while (cnt <= 5) {
				M = q.peek();
				if (M - cnt > 0) {
					q.poll();
					q.offer(M-cnt);
					
					if(cnt < 5 ) {
						cnt++;
					} else cnt = 1;
				}
				
				M = q.peek();
				if (M - cnt <= 0) {
					q.poll();
					q.offer(0);
					break;
				}
			}
	
			
				System.out.print("#" + b + " ");
				for(int i = 0; i < 8; i++) {
					System.out.print(q.poll() + " ");
				}
				System.out.println();
//			
//			System.out.println(T);

		}
	}

}
