
import java.util.Scanner;

public class 최장증가부분수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int arr[] = new int[N]; // 숫자 받아올 배열
			int LIS[] = new int[N]; // 자신을 마지막으로 하는 부분 집합 길이 저장할 배열

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt(); // 값을 arr 배열에 저장한다.
			}

			int max = 0; // 최대값은 0으로 초기화
			for (int i = 0; i < N; i++) {
				LIS[i] = 1; // 자기 자신은 무조건 부분집합에 포함되니까 1로 초기화

				for (int j = 0; j < i; j++) { // 자신 직전 값까지 비교
					if (arr[j] < arr[i] && LIS[i] < LIS[j] + 1) {
						// 직전 값이 자기 보다 작고, 직전의 부분집합 길이 + 1 한것이 더 크다면
						LIS[i] = LIS[j] + 1; // 자신을 마지막으로 하는 부분집합 길이를 직전의 값으로 대입한다.
					}
				}
				if (max < LIS[i])
					max = LIS[i]; // max의 최대 길이를 입력
			}
			System.out.println("#" + t + " " + max);
		}
	}

}
