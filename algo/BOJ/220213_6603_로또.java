import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); 
			int arr[] = new int[n+1];
			int visit[] = new int[n+1];
			
			if(n == 0) {
				break;
			}
			
			// 배열 저장
			for(int i = 1; i < n + 1; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
		
			// 조합 start! 
			com(arr, visit, 1, 6);
			System.out.println();
		}
		
		
	}
	
	static void com(int arr[], int visit[], int depth, int r) {
		if(r == 0) {
			for(int i = 1; i < arr.length; i++) {
				if(visit[i] == 1) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
			return; 
		}
		if(depth == arr.length) {
			return;
		}
		else {
            visit[depth] = 1;
            com(arr, visit, depth + 1, r - 1);
 
            visit[depth] = 0;
            com(arr, visit, depth + 1, r);
        }
		
	}
}