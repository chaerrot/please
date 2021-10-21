package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

		for (int a=1; a<=9; a++) {
			for (int b=2; b<=9; b++) {
				System.out.printf("%d*%d=%2d ", b, a, b*a);
			}
			System.out.println(" ");
		}
	}

}
