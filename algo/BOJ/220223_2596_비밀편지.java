import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 비밀편지 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		String str = br.readLine();
		
		String code[] = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
		String key[] = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		// 비밀 편지를 6개씩 끊어서 저장
		for(int i = 0; i < str.length(); i+=6) {
			if(i+6 > str.length()) break;
			
			arr[i/6] = str.substring(i, i+6);
		}
		
		
		// 코드 복호화
		for(int i = 0; i < n; i++) {
			boolean flag = true;
			for(int j = 0; j < code.length; j++)  {
				// 문자열이 완전히 같을 때
				if(code[j].equals(arr[i])) {
					// 알파벳을 추가하고 나간다.
					sb.append(key[j]);
					flag = true;
					break;
				}
				
				// 문자열이 부분으로 같을 때 
				else {
					int cnt = 0;
					for(int z = 0; z < 6; z++) {
						if(code[j].charAt(z) != arr[i].charAt(z)) {
							
							// 하나 이상 다를 경우
							if(cnt >= 1) {
								// flag 값을 false로 만든다.
								flag = false;
								break;
							}
							
							// 다른 문자열이 존재하면 카운트 해준다.
							cnt++;
						}
						
						// 같으면 flag 값을 true로 만든다.
						else {
							flag = true;
						}
					}
					
					// 문자열을 하나씩 비교했을 때, 1개 빼고 같으면 같은 코드로 관주한다.
					if(flag) {
						sb.append(key[j]);
						break;
					}
				}
				
			
			}
			
			// 문자열이 다르다고 판단, 저장한 코드를 초기화 하고 최초 다른 부분의 순서를 출력한다.
			if(!flag) {
				sb.setLength(0);
				System.out.println(i+1);
				break;
			}
		}
		
		// 정답 출력
		System.out.println(sb.toString());
		
	}
}