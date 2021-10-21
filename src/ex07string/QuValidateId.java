package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String ID;
		
		System.out.println("아이디를 입력하세요: ");
		ID = scanner.next();
		
		if (idValidate(ID)) {
			System.out.println("사용할 수 없습니다.");
		}
		else {
			System.out.println("사용할 수 있는 아이디입니다.");
		}
	}
	
	public static boolean idValidate(String inputId) {
		
		if (inputId.length()>=8 || inputId.length()<=12) {
			for (int i=0; i<inputId.length(); i++) {
				if ( (inputId.charAt(i)>='a' && inputId.charAt(i)<='z') || 
						(inputId.charAt(i)>='A' && inputId.charAt(i)<='Z') ||
						(inputId.charAt(i)>='0' && inputId.charAt(i)<='9') ) {
					return true;
				}
			}
		}
			return false;
	}
}
