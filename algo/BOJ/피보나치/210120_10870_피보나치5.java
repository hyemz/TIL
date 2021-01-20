import java.util.Scanner;

public class BOJ_10870_피보나치5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[22];
		
		d[1] = 0;
		d[2] = 1;
		
		for(int i = 3; i <= 21; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[N + 1]);
	
	}

}
