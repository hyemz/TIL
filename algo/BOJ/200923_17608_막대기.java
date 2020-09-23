

import java.util.Scanner;

public class stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int stick [] = new int [cnt];
		int view = 1;
		
		for(int i = 0; i < cnt; i++) {
			stick[i] = sc.nextInt();
		}
		
//		for(int x : stick) {
//			System.out.print(x + " ");
//		}
		int min = stick[cnt-1];
		for(int i = cnt-2; i >= 0; i--) {
			if(min < stick[i]) {
				min = stick[i];
				view++;
			}
		}
		System.out.println(view);
	}

}
