import java.util.Scanner;

public class BOJ_18406_럭키스트레이트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int cnt1 = 0;
		int cnt2 = 0; 
		
		for(int i = 0; i < s.length(); i++) {
			if(i < s.length() / 2) {
				cnt1 += c[i] -'0';
			}
			else {
				cnt2 += c[i] -'0';
			}
		}
		
		if(cnt1 == cnt2) 
			System.out.println("LUCKY");
		else System.out.println("READY");
	}

}
