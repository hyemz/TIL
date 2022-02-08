import java.util.Arrays;
import java.util.Scanner;

public class 선물 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		
		// 저장소 선언 
		int a[] = new int[N];
		int b[] = new int[N];
		
		// 배열에 저장
		for(int n = 0; n < N; n++) {
			a[n] = sc.nextInt();
		}
		for(int n = 0; n < N; n++) {
			b[n] = sc.nextInt();
		}

		// a 정렬 
		Arrays.sort(a);
		
		// b 정렬
		Arrays.sort(b);
		
		// 제일 작은 값 계산
		int result = 0;
		for(int i = 0; i < N; i++) {
			result += a[i] * b[N-i-1];
		}
		
		// 정답 표시
		System.out.println(result);
	}
}

// 조합으로 풀 경우, 시간초과가 발생했다. 
/*
public class 선물 {
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		
		// 저장소 선언 
		int a[] = new int[N];
		int b[] = new int[N];
		
		// 배열에 저장
		for(int n = 0; n < N; n++) {
			a[n] = sc.nextInt();
		}
		for(int n = 0; n < N; n++) {
			b[n] = sc.nextInt();
		}

		// a 순서 바꿀 수 있는 경우 저장 (순서가 상관 없으니 조합)
		per(a, b, 0, N, N);
		
		// 제일 작은 값 추출 (추출)
		System.out.println(min);
	}
	
	static void per(int[] a, int[] b, int depth, int n, int r) {
		if(depth == r) {
			// 경우의 수에 맞게 계산
			int result = 0; 
			
			for(int i = 0; i < n; i++) {
				result += a[i] * b[i]; 
			}
			
			// 값 저장
			if(result < min) {
				min = result;
			}
			return;
		}

		for(int i = depth; i < n; i++) {
			swap(a, depth, i);
			per(a, b, depth + 1, n, r);
			swap(a, depth, i);
		}
	}
	
	// 조합 만드는 함수
	static void swap(int[] a, int depth, int i) {
		int tmp = a[depth];
		a[depth] = a[i];
		a[i] = tmp;
	}

}
*/
