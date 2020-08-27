

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class alphabet {
	static int row, col, answer, cnt;
	static char[][] pan;
	static int[] dr = { 0, 0, -1, 1 };
	static int[] dc = { 1, -1, 0, 0 };
	static ArrayList<Character> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		// 메모리 낭비를 막기 위해 이런식으로 배열 만들기!
		pan = new char[row][];
		for (int i = 0; i < row; i++) {
			pan[i] = br.readLine().toCharArray();
		}

//		System.out.println(pan[0][1]);
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(pan[i][j]);
//			}
//			System.out.println();
//		}

		list.add(pan[0][0]);
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				go(i, j);
//			}
//		}
		answer = 0;
		cnt = 0;
		go(0, 0);
		System.out.println(answer);
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

	private static void go(int rowNo, int colNo) {
		// TODO Auto-generated method stub
		cnt++;
		answer = Math.max(answer, cnt);
		C: for (int k = 0; k < 4; k++) {
			int nx = rowNo + dr[k];
			int ny = colNo + dc[k];

			if (ny >= 0 && ny < col && nx >= 0 && nx < row) {
				 for (int i = 0; i < list.size(); i++) {
					if (pan[nx][ny] == list.get(i))
						continue C;
				}
				list.add(pan[nx][ny]);
				go(nx,ny);
				cnt--;
				list.remove(list.size()-1);
			}
		}
		return;

	}

}
