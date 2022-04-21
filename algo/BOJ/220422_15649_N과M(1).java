import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class N과M {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];
		boolean[] visited = new boolean[N];
		
		//per(arr, 0, N, M);
		per2(arr, visited, 0, N, M);
		
	}

	static void per(int[] arr, int depth, int n, int m) {
		// TODO Auto-generated method stub
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = depth; i < n; i++) {
			swap(arr, depth, i);
			per(arr, depth+1, n, m);
			swap(arr, depth, i);
		}
		
	}
	
	static void per2(int[] arr, boolean[] visited, int depth, int n, int m) {
		if(depth == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				per2(arr, visited, depth + 1, n, m);    
				visited[i] = false;
			}
		}
	}

	static void swap(int[] arr, int depth, int i) {
		// TODO Auto-generated method stub
		int tmp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = tmp;
	}
	

}