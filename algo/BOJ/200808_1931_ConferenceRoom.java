

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1931_ConferenceRoom {
	static class Room implements Comparable<Room> // ★
	{ // 구현의 약속( 부모에 선언된 메소드를 자식에 구현)
		int startTime, endTime;// 번호,점수

		public Room(int startTime, int endTime) {
			super();
			this.startTime = startTime;
			this.endTime = endTime;
		}

		// @Override
		public int compareTo(Room o) {
//			return this.no - o.no; //기준 no을 정의~!!  0~양수, 음수(변환swap)
//			return score - o.score; //기준 score을 정의~!!  0~양수, 음수(변환swap)
//			return o.score - score; //내림차순
			if (endTime == o.endTime) {
				return Integer.compare(startTime, o.startTime);
			}
			return Integer.compare(endTime, o.endTime);
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int min;
		int mins;
		int result = cnt;

		Room room[] = new Room[cnt];
		for (int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int startTime = Integer.parseInt(st.nextToken());
			int endTime = Integer.parseInt(st.nextToken());

			room[i] = new Room(startTime, endTime);
		}
		Arrays.sort(room); // 1,2 4,5 6,7 3,10

		min = room[0].endTime; // 2
		int tmp = 0;
		for (int i = 1; i < cnt; i++) {
			// min 보다 커야된다.
			if (min <= room[i].startTime) {
//				for (int j = i; j < cnt; j++) {
				mins = room[i].startTime;
				tmp = room[i].endTime;
//					if (min <= room[j].startTime && mins > room[j].startTime && tmp < room[j].startTime
//							&& tmp < room[j].endTime ) {
//						mins = room[j].startTime;
//						tmp = room[j].endTime;
//					} 
//				}
			} else {
				--result;
				continue;
			}
			min = tmp;
		}
//		System.out.println();
//
//		for (int i = 0; i < room.length; i++)
//			System.out.println(room[i].startTime + " " + room[i].endTime);

		System.out.println(result);

	}

}
