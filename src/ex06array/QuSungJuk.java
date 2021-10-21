package ex06array;

import java.util.Scanner;

public class QuSungJuk {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int studentNum = 0;
		
		System.out.print("학생 수를 입력하세요? ");
		studentNum = scanner.nextInt();
		
		System.out.println("학생 수: "+ studentNum);
		
		int[][] sungjuk = new int[studentNum][5];
		String[] arr1 = {"국어", "영어", "수학"};
		
		for (int i=0; i<studentNum; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n", i+1);
			for (int j=0; j<3; j++) {
				System.out.printf("%s점수 입력: ", arr1[j]);
					sungjuk[i][j] = scanner.nextInt();
			}
			
		}
		System.out.println();
		
		System.out.println("===========================");
		System.out.println("NO  KOR  ENG  MAT  TOT  AVG");
		System.out.println("===========================");
		
		for (int i=0; i<sungjuk.length; i++) {
			int sum = sungjuk[i][0] + sungjuk[i][1] + sungjuk[i][2];
			System.out.printf("%-4d %-4d %-4d %-4d %-4d %-4.2f \n",
					i+1, sungjuk[i][0], sungjuk[i][1], sungjuk[i][2], sum, (sum/3.0));
		}
		System.out.println();
		
	}
}
