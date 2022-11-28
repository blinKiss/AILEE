package 과제;

public class ThreeSixNine2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int one = i % 10;
			// 10으로 나눈 후 남은 1의 자리
			int ten = i / 10;
			// 10으로 나눈 몫
			int syg = 0;
			int syg2 = 0;
			if (one == 3 || one == 6 || one == 9) {
				syg = 1;
			}
			if (ten == 3 || ten == 6 || ten == 9) {
				syg2 = 1;
			}
			if (syg + syg2 == 2) {
				System.out.println("**");
			} else if (syg + syg2 == 1) {
				System.out.println("*");
			} else
				System.out.println(i);
		}

	}
}