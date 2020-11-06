import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1543_문서검색 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String search = br.readLine();
		int num = search.toCharArray().length;
//		System.out.println(num);

		int cnt = 0;
		boolean flag = false;
		d: for (int i = 0; i < word.length(); i++) {
			flag = false;
			c: for (int j = 0; j < num; j++) {
				if ((j + i) >= word.length())
					break d;
				if (word.charAt(j + i) == search.charAt(j)) {
					flag = true;
				} else {
					flag = false;
					break c;
				}
			}
			if (flag) {
				i = i + num - 1;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
