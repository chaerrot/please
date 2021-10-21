package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		
		int total = 0;
//		int k = 1;
//		while (k<=100) {
//			if (k%3==0 || k%7==0) {
//				
//				total += k;
//				System.out.print(k+ " + ");
//			}
//			k++; 
//		}	
		
			for (int i=3; i<=7; i++) {
				if (i%3==0 || i%7==0) {
					continue;
				}
				System.out.print(i+ " + ");
				total += i;
			}
		
		System.out.println("= "+ total);
				
		
	}
}
