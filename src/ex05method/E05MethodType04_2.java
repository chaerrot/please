package ex05method;

import java.util.Scanner;

/*
 시나리오] 여러 개의 숫자를 입력 받은 후 최대값을 구하는
 메소드를 정의하시오. 단, 숫자의 개수는 매개변수로 전달 받고
 숫자의 개수만큼 Scanner클래스를 통해 입력 받는다.
 입력 받은 숫자 중 최대값을 찾아서 반환하도록 정의한다.
 */
public class E05MethodType04_2 {

	public static void main(String[] args) {
		
		//정수 4개 중 최대값 찾기
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1: "+ maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2: "+ maxValue2);
	}
	
	//main에서 전달한 인자 4는 매개변수 numberCnt가 받아서 사용함.
	static int returnMaxNumber (int numberCnt) {
		
		Scanner scanner = new Scanner(System.in);
		//최대값을 저장하기 위한 변수 선언
		int maxVal = 0;
		//매개변수로 전달된 인자만큼 반복하여 입력 받음
		for (int i=1; i<=numberCnt; i++) {
			System.out.print("정수를 입력하세요: ");
			int inputNum = scanner.nextInt();
			
			if (i==1) {
				//입력 받은 정수 중 첫 번째 값을 기준값으로 설정한다.
				maxVal = inputNum; //첫 번째 값을 일단 최대값으로 지정한다.
			}
			else {
				//두 번째 입력부터는 기준값인 maxVal과 입력값을 비교한다.
				if (maxVal<inputNum) {
					//만약 maxVal보다 입력값이 크다면 입력값으로 교체한다.
					maxVal = inputNum;
				}
				//maxVal이 더 크다면 기존값을 유지하면 되므로 else는 필요 없다.
			}
		}
		return maxVal;
	} //end of returnMaxNumber
	
}
