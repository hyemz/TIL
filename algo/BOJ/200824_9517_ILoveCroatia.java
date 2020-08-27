
import java.util.Scanner;

public class BOJ_9517_ILoveCroatia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt(); // 게임 시작 사람
		int person_check = 0; // 사람 번호 체크
		int question = sc.nextInt(); // 질문 수
		int time = 0; // 문제 푸는데 걸린 시간
		String answer = null; // 답
		int controlTime = 210; // 폭탄 터지는 시간
		int bomb = 0; // 폭탄 체크

		for (int i = 1; i <= question; i++) {
			time = sc.nextInt();
			bomb += time;
			answer = sc.next();

			if (bomb >= controlTime) {
//				person_check = person;
				System.out.println(person);
//				flag = true;
				break;
			}

			if (answer.equals("T")) {
				if (person == 8) {
					person = 1;
					continue;
				} else
					person++;
			}

		}

	}

}
