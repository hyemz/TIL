import java.util.Scanner;

public class BOJ_9095_123더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int d[] = new int [12];
			
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;
			
			for(int i = 4; i <= 11; i++) {
				d[i] = d[i-3] + d[i-2] + d[i-1];
			}
			System.out.println(d[N]);
		}
	}

}
