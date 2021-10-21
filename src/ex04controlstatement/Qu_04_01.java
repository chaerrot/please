package ex04controlstatement;

import java.io.IOException;

/*
 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
 */
public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
										// 예외 적용, 자동완성으로 입력 
//		int i = 0;
//		System.out.println("하나의 문자를 입력하세요: ");
//		box = System.in.read();
		
		System.out.print("하나의 문자를 입력하세요: ");
		int ascii = System.in.read();
		
		/*
		 삼항연산자의 형식
		 	변수 = (조건식) ? "참일때" : "거짓일때" ;
		 */
		// 아스키코드를 알고 있을 때 (47~58 사이)
		String result = (ascii>=47 && ascii<=58) ? "숫자입니다" : "숫자가 아닙니다";
		System.out.println((char)ascii+ " 은(는) "+ result);
						// 문자형으로 캐스팅..
		
		// 아스키코드를 모를 때
		result = (ascii>='0' && ascii<='9') ? "숫자입니다" : "숫자가 아닙니다";
		System.out.println((char)ascii+ " 은(는) "+ result);
		
	}

}
