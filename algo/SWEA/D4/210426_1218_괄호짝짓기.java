package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA_1218_괄호짝짓기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t = 1; t <= 10; t++) {
		Stack<Character> stack = new Stack<>();
		int num = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int flag = 1;
		
		for(int k = 0; k < num; k++) {
			if(s.charAt(k) == '(' || s.charAt(k) == '{' || s.charAt(k) == '[' || s.charAt(k) == '<') {
				stack.push(s.charAt(k));
			}
			else {
				if(stack.size() == 0) {
					flag = 0;
					break;
				}
				else {
					char tmp = stack.pop();
					if((s.charAt(k) == ')' && tmp == '(' )|| (s.charAt(k) == '}' && tmp == '{')
				|| (s.charAt(k) == ']' && tmp == '[') || (s.charAt(k) == '>' && tmp == '<')) {
						flag = 1;
						continue;
					}
					else {
						flag = 0;
						break;
					}
				}
			}			
		}
		System.out.println("#" + t + " " + flag);
		}
	}

}
