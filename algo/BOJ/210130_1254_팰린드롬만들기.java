import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1254_팰린드롬만들기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
//		char s[] = new char[1001];

		System.out.println(solve(s));
	}

	private static int solve(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(s);
		if(check(sb)) {
			return sb.length();
		}
		
		for(int i = 1; i < s.length(); i++) {
			sb = new StringBuilder(s);
			sb.append(new StringBuilder(sb.substring(0, i)).reverse());
			
			if(check(sb)) {
				return sb.length();
			}
		}
		return -1;
	}

	private static Boolean check(StringBuilder sb) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (sb.toString().equals(sb.reverse().toString())) {
			flag = true;
		}
		return flag;
	}

}
