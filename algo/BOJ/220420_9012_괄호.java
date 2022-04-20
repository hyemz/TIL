import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			Stack<Character> sc = new Stack<Character>();
			
			for(int c = 0; c < s.length(); c++) {
				
				if(s.charAt(c) == '(') {
					sc.push(s.charAt(c));
					//System.out.println("in");
				}
				else {
					if(sc.size() == 0) {
						System.out.println("NO");
						break;
					}
					else {
						sc.pop();
					}
				}
				
				if(c == s.length() - 1)
					if(sc.size() > 0) {
						System.out.println("NO");
						break;
					}
					else {
						System.out.println("YES");
					}
				
			}
			
		}
		
	}

}