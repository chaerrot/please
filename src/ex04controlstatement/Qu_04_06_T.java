package ex04controlstatement;
/*
 *
* *
* * *
* * * *
* * * * *
 */
public class Qu_04_06_T {

	public static void main(String[] args) {

		int i=1;
		while (i<=5) {
			int j=1;
			while (j<=i) {
				
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}