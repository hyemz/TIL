package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1208_Flatten {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int T = 1; T <= 10; T++) {
			int dump = Integer.parseInt(br.readLine());
			int box[] = new int[100];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				box[i] = tmp;
			}


			for(int i = 1; i <= dump; i++) {
				// step 1 정렬
				Arrays.sort(box);
				
				// 평준화 확인
				if (box[99] - box[0] <= 1) {
					break;
				}
				
				// 아니라면 dump 시키기
				box[99] -= 1;
				box[0] += 1;
			}
			Arrays.sort(box);
			int result = box[99] - box[0];
			System.out.println("#" + T + " " + result);
		}
	}

}
