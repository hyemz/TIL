import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2164_카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 1; 
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			q.poll();
			if(q.isEmpty()) break;
			n = q.poll();
			q.add(n);
		}
		System.out.println(n);
	}
}
