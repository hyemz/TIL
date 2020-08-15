

public class BOJ_6679_FourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1000; i < 10000; i++) {
			int ten = 0;
			int twelve = 0;
			int sixteen = 0;
			for (int n = i; n > 0; n /= 10) {
				ten += n % 10;
			}
			for (int n = i; n > 0; n /= 12) {
				twelve += n % 12;
			}
			for (int n = i; n > 0; n /= 16) {
				sixteen += n % 16;
			}
			if (ten == twelve && twelve == sixteen)
				System.out.println(i);

		}
	}

}
