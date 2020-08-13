
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_4641_Double {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		boolean flag = false;
		int cnt = 0;

		while (!flag) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.removeAll(list);
			for (int i = 0; i < 15; i++) {
				int s = Integer.parseInt(st.nextToken());
				if (s == 0)
					break;

				if (s == -1) {
					flag = true;
					break;
				}
				list.add(s);
			}
			if (flag == true)
				break;

			for (int i = 0; i < list.size(); i++) {
				int t = list.get(i);
				for (int j = 0; j < list.size(); j++) {
					if (2 * t != list.get(j)) {
						continue;
					}
					cnt++;
				}
			}

			System.out.println(cnt);
			cnt = 0;
//			for(int i = 0; i < list.size(); i++) {
//				System.out.print(list.get(i) + " ");
//			}System.out.println();
		}

	}

}
