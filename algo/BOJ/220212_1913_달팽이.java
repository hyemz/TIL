import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Scanner;

public class 달팽이 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
		//int N = sc.nextInt(); // 달팽이 사이즈
		//int search = sc.nextInt(); // 찾을 값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); // 달팽이 사이즈
		int search = Integer.parseInt(br.readLine()); // 찾을 값 
		
		int start = N*N; // 최초 값
		
		int snail[][] = new int[N+1][N+1];
		int visit[][] = new int[N+1][N+1];
		int loc_i = 1;
		int tmp_i = 1;
		int loc_j = 1;
		int tmp_j = 1;
		
		
		while(true) {
			// i++, j 
			for(int i = loc_i; i < N+1; i++) {
				if(visit[i][loc_j] == 0) {
					snail[i][loc_j] = start;
					start--;
					visit[i][loc_j] = 1;
					tmp_i = i;
				}
			}
			loc_i = tmp_i;
			
			// i, j++
			for(int j = loc_j; j < N+1; j++) {
				if(visit[loc_i][j] == 0) {
					snail[loc_i][j] = start;
					start--;
					visit[loc_i][j] = 1;
					tmp_j = j;
				}
			}
			loc_j = tmp_j;
			
			// i--, j
			for(int i = loc_i; i >= 1; i--) {
				if(visit[i][loc_j] == 0) {
					snail[i][loc_j] = start;
					start--;
					visit[i][loc_j] = 1;
					tmp_i = i;
				}
			}
			loc_i = tmp_i;
			
			// i, j--
			for(int j = loc_j; j >= 1; j--) {
				if(visit[loc_i][j] == 0) {
					snail[loc_i][j] = start;
					start--;
					visit[loc_i][j] = 1;
					tmp_j = j;
				}
			}
			loc_j = tmp_j;
			
			if(start == 0) {
				break;
			}
		}
		
		// 정답 추출
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
		
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < N+1; j++) {
				bw.write(snail[i][j] + " ");
				//System.out.print(snail[i][j]+" ");
				if(snail[i][j] == search) {
					loc_i = i;
					loc_j = j;
				}
			}
			bw.write("\n");
			//System.out.println();
		}
		bw.write(loc_i + " " + loc_j);
		//System.out.print(loc_i + " " + loc_j);
		bw.flush();   // 남아있는 데이터를 모두 출력시킴
		bw.close();   // 스트림을 닫음
		
	}

}