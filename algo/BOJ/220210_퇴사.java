import java.util.Scanner;

public class 퇴사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 퇴사까지 남은 일수 : 퇴사는 N+1
		int N = sc.nextInt();
		
		// 걸리는 시간, 보수, 누적 보수 메모
		int time[] = new int[N+1];
		int money[] = new int[N+1];
		int memo[] = new int[N+2]; 
		
		for(int i = 1; i < N+1; i++) {
			time[i] = sc.nextInt();
			money[i] = sc.nextInt();
		}
		
		// 최대 보수 계산
		for(int i = N; i > 0; i--) {
			int addTime = i + time[i];
		
			// 퇴사 후에 끝나는 경우
			if(addTime > N + 1) {
				memo[i] = memo[i+1];
			}
			
			// 퇴사 전에 끝나는 경우
			else {
				memo[i] = Math.max(memo[i+1], memo[addTime]+money[i]);
			}
			
		}
        
        // 최대 누적 보수
		System.out.println(memo[1]);
	}

}