import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11053_가장긴증가하는부분수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int d[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		d[0] = 1;
		for(int i = 1; i < N; i++) {
			d[1] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && d[i] <= d[j] ) {
					d[i] = d[j] + 1;
				}
			}
		}

		Arrays.sort(d);
		System.out.println(d[N-1]);
		

		for(int i : d) {
			System.out.println(i);
		}
		
//		System.out.println(cnt);
	}

}
