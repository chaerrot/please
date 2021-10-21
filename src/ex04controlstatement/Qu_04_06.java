package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		
//		for (int i=1; i<=5; i++) {
//			for (int j=0; j<i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		int i=1;
		int j=1;
		
		while (i<=5) {
			while (j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
