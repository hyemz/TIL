
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dfsbfs {
	static int N;
	static int M;
	static int V;

	static ArrayList<Integer>[] adjList;
	static boolean[] visited;

	// 인접 리스트로 구현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 정점수
		M = sc.nextInt(); // 간선수
		V = sc.nextInt(); // 탐색할 정점의 번호

		adjList = new ArrayList[N + 1];
		for (int i = 0; i < N + 1; i++) {
			adjList[i] = new ArrayList<Integer>();
		}

		visited = new boolean[N + 1];
		for (int i = 0; i < M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjList[from].add(to);
			adjList[to].add(from);
		}

		// 방문할 수 있는 정점이 여러개라면 최소값부터 방문하기 위해 리스트를 정렬해준다.
		for (int i = 0; i < adjList.length; i++) {
			Collections.sort(adjList[i]);
		}

//		System.out.println("=========dfs============");
		dfs(V);
		System.out.println();
//		System.out.println("=========bfs============");
		bfs();

	}

	
	private static void dfs(int current) {
		visited[current] = true;
		System.out.print(current + " ");

		for (int temp : adjList[current]) {
			if (!visited[temp]) {
				dfs(temp);
			}
		}

	}

	private static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[N + 1];

		int current = V;
		queue.offer(current);
		visited[current] = true;

		while (!queue.isEmpty()) {
			current = queue.poll();
			System.out.print(current + " ");

			for (int temp : adjList[current]) {
				if (!visited[temp]) {
					queue.offer(temp);
					visited[temp] = true;
				}
			}

		}

	}

}
