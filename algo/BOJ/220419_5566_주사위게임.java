import java.io.IOException;
import java.util.Scanner;

public class 주사위 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int map[] = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			map[i] = sc.nextInt();
		}
		
		int tmp = 1;
		int loc = 1;
		for(int i = 1; i <= M; i++) {
				int mix = sc.nextInt(); // 주사위에서 나온 숫자
				//System.out.println(map[mix]);
				//System.out.print("loc");
				//System.out.println(loc);
				loc += mix; // 말의 위치
				
				// check 로직
				if(loc >= N) {
					System.out.println(i);
					break;
				}
				tmp = map[loc];
				//System.out.print("for");
				//System.out.println(tmp);
				
				loc += tmp; // 말의 위치 다시 적용
				
				// check 로직
				if(loc >= N) {
					System.out.println(i);
					break;
				}
				//System.out.println(tmp);
				
		}
		
		
	}

}