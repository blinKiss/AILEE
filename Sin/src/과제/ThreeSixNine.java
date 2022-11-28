package 과제;

public class ThreeSixNine {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int one = i % 10;
			// 10으로 나눈 후 남은 1의 자리
			int ten = i / 10;
			// 10으로 나눈 몫
			boolean one369 = false;
			boolean ten369 = false;

			if (one == 3 || one == 6 || one == 9) {
				one369 = true;
			}
			if (ten == 3 || ten == 6 || ten == 9) {
				ten369 = true;
			}
			if (one369 && ten369 == true) {
				System.out.println("**");
			} else if (one369 || ten369 == true) {
				System.out.println("*");
			} else
				System.out.println(i);
		}

	}
}