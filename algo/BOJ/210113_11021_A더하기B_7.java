import java.util.Scanner;

public class BOJ_11021_A더하기B_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			System.out.print("Case #" + i + ":" + " ");
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}

}
