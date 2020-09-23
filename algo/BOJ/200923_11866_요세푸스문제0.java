

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			q.add(i);
		}
		
		System.out.print("<");
		while(!q.isEmpty()) {
			for(int i = 0; i < k-1; i++) {
				q.add(q.poll());
			}
			if(q.size() == 1) {
				System.out.print(q.poll());
			} else {
			System.out.print(q.poll() + ", ");
			}
		}
		System.out.print(">");
		
		
	}

}
