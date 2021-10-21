package ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */
public class E04MethodType03_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2~9 사이의 숫자 중 2개를 입력해주세요.");
		System.out.print("작은 수(시작단): ");
		int num1 = scanner.nextInt();
		System.out.print("큰 수(종료단): ");
		int num2 = scanner.nextInt();
		//입력받은 단을 매개변수로 메서드 호출
		inputGugudan(num1, num2);
		
	}
	
	static void inputGugudan(int sNum, int eNum) {
		//기존 구구단 프로그램을 sNum에서 eNum단까지 출력하는 것으로 변경
		System.out.println(sNum + "단에서 "+ eNum+"단까지의 구구단을 출력합니다.");
		for (int a=sNum; a<=eNum; a++) {
			for (int b=1; b<=9; b++) {
				System.out.printf("%d*%d=%2d ", a, b, a*b);
			}
			//단을 출력한 후 줄바꿈
			System.out.println(" ");
		}
	}
}
