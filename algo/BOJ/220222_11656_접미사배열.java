import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 접미사배열 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String arr[] = new String[s.length()];
		
		// 부분배열 저장
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.substring(i, s.length());
		}
		
		// 배열 정렬
		Arrays.sort(arr);
		
		// 정답 출력
		for(int i = 0; i < s.length(); i++) {			
			System.out.println(arr[i]);
		}
	}
}