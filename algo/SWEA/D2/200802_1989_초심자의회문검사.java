import java.util.Scanner;
public class P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		
		for (int t = 1; t <=T; t++) {
			String s = sc.next();
			for(int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == s.charAt(s.length()-i-1)) {
					answer = 1;
				} else {
					answer = 0;
					continue;
				}
			}
			System.out.println("#" + t + " " + answer);
		}
	}

}
