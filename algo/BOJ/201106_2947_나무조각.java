import java.util.Scanner;

public class BOJ_2947_나무조각 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		while (flag) {
			for (int i = 0; i < 4; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				} else
					continue;
				for (int j = 0; j < 5; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
				if (arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5)
					flag = false;
			}
		}

	}

}
