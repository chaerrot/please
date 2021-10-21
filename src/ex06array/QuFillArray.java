package ex06array;

import java.util.Scanner;

/*
 문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 
순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 
짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
 */
public class QuFillArray
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int a=0, b=9;
		
		for (int i=0; i<arr1.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요:");
			arr1[i] = scanner.nextInt();	
		}

		System.out.println("순서대로 입력된 결과");
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		System.out.println();
		
		System.out.println("홀수/짝수 구분 입력 결과");
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i]%2 == 0) {
				arr2[b--] = arr1[i];
			}
			else {
				arr2[a++] = arr1[i];
			}
		}
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
			
		}
		
	}
}
