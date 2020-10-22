
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_2606_바이러스 {
	static int N, R, cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		R = sc.nextInt();
		int start = 1;

		// visit 배열을 만들어서 방문한 곳만 찾아주면 인접한 곳을 알 수 있다?
		int visit[] = new int[N + 1];
		
		// 인접 리스트로 구현
		LinkedList<Integer>[] virus = new LinkedList[N + 1];

		// 정점 초기화
		for (int i = 0; i <= N; i++) {
			virus[i] = new LinkedList<>();
		}

		// 관계에 맞게 데이터 입력
		for (int i = 0; i < R; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			virus[v1].add(v2);
			virus[v2].add(v1);
		}

		// dfs를 활용해서 완전 탐색을 해주자!
		dfs(start, virus, visit);

//		System.out.println(virus[1].get(0));
//		System.out.println(virus[1].get(1));
//		System.out.println("cnt" + cnt);
//		System.out.println(virus[2].size());

		// 방문한 곳이면 cnt++ 해준다. 
		for (int i = 2; i < visit.length; i++) {
			if (visit[i] != 0)
				cnt++;
		}
		System.out.println(cnt);
	}

	// dfs로 완전 탐색! 
	private static void dfs(int start, LinkedList<Integer>[] virus, int[] visit) {
		// TODO Auto-generated method stub
		for (int j = 0; j < virus[start].size(); j++) {
			if (visit[virus[start].get(j)] == 0) {
				visit[virus[start].get(j)] = virus[start].get(j);
				dfs(visit[virus[start].get(j)], virus, visit);
			}
		}
	}

}
