import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1652_누울자리를찾아라 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char arr1[][] = new char[N][N];
		char arr2[][]= new char[N][N];
		int cnt = 0;
		int width = 0;

		for (int i = 0; i < N; i++) {
			char c[] = br.readLine().toCharArray();
			for (int j = 0; j < N; j++) {
				arr1[i][j] = c[j];
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				arr2[i][j] = arr1[j][i];
			}
		}
		
//		for(int i = 0; i < N; i++) {
//			for(int j = 0; j < N; j++) {
//				System.out.print(arr2[i][j]);
//			}
//			System.out.println();
//		}

		fight(arr1, cnt, width, N);
		System.out.print(" ");
		fight(arr2, cnt, width, N);
	}

	private static void fight(char[][] arr, int cnt, int answer, int N) {
		// TODO Auto-generated method stub
		for (int i = 0; i < N; i++) {
			cnt = 0;
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 'X') {
					if (cnt >= 2) {
						answer++;
					}
					cnt = 0;
					continue;
				}
				cnt++;
			}
			if (cnt >= 2) {
				answer++;
				cnt = 0;
			}
		}
		System.out.print(answer);
	}

}
