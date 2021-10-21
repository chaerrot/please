package ex02variable;
/*
 문제3] 파일명 : Qu_02_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야 한다.
 */
public class Qu_02_03 {

	public static void main(String[] args) {

		// 원주율은 변하지 않는 값이므로 상수로 선언한다.
		final double PI = 3.14; //final?
		int radius = 10; //반지름	
//		int radian = 10; //반지름
		
		
//		int area_int; //정수형 넓이
//		double area_double; //실수형 넓이		
		int area_int = (int)(radius*radius*PI);
		double area_double = radius*radius*PI;
		
//		area_double = radian*radian*PI;
//		area_int = radian*radian*PI; //방법1
//		area_int = (int)area_double; //방법2
		
		System.out.println("int형 넓이: "+ area_int);
		System.out.println("double형 넓이: "+ area_double);	
//		System.out.println("double형 넓이: "| (radian*radian*PI));
		//방법3, 계산과 출력을 한 번에..
		
	}
}
