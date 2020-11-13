import java.util.Scanner;

public class BOJ_17204_죽음의게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
		int cnt = 0;
		int tmp = 0; 
		int bosung = sc.nextInt();
		int game[] = new int [person];
		
		for(int i = 0; i < person; i++) {
			game[i] = sc.nextInt();
		}
		
		boolean flag = false;
		while(!flag) {
			tmp = game[tmp];
			cnt++;
			if(tmp == bosung) {
				flag = true;
				break;
			}
			if(cnt == person) break;
		}
		
		if(flag) {
			System.out.println(cnt);
		}else System.out.println(-1);
		
	}

}
