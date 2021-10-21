package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//개발자 정의 예외 클래스
class WrongNumberException extends Exception {
	public WrongNumberException()
	{
		super("[예외발생]숫자를 잘못 입력했습니다.");
	}
}

public class QuRockPaperScissors2
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		
		while (true) {
		
			//1. 난수생성 - 컴퓨터 입장에서 가위/바위/보
			int com = random.nextInt(10000) % 3 + 1; //1~3사이의 난수
			System.out.println("컴퓨터: "+ com);
			
			//2. 사용자입력
			
			int user = 0;
			try {
				System.out.println("가위바위보를 입력하세요.");
				System.out.print("가위(1), 바위(2), 보(3) => ");
				user = scanner.nextInt();
			
				/*
				 숫자 외에 문자를 입력하면 메서드 내에서 예외가 발생하므로
				 엔터키가 버퍼에 남게 된다. 
				 */
				
				//사용자가 1 미만 혹은 3 초과된 숫자를 내는 경우 사용자 예외 발생
				if (user<1 || user>3) {
					WrongNumberException wne = new WrongNumberException();
					throw wne;
				}
				
			}
			catch (InputMismatchException e) {
				//버퍼에 남아있는 엔터키를 제거한다.
				scanner.nextLine();
				System.out.println("가위바위보 입력오류(숫자만입력)");
			}
			
			catch (WrongNumberException e) {
				System.out.println("게임과 관련된 숫자만 입력하세요(1~3사이)");
				System.out.println(e.getMessage());
				
			}
		
			
			//3. 승부판단
			//사용자가 정상적으로 입력한 경우
			if (!(user<1 || user>3)) {
				//승부판단 로직1
				if (com==1 && user==1) System.out.print("사용자: 가위, 컴퓨터: 가위\n비겼습니다.\n");
				if (com==1 && user==2) System.out.print("사용자: 바위, 컴퓨터: 가위\n비겼습니다.\n");
				if (com==1 && user==3) System.out.print("사용자: 보, 컴퓨터: 가위\n비겼습니다.\n");
				
				if (com==2 && user==1) System.out.print("사용자: 가위, 컴퓨터: 바위\n비겼습니다.\n");
				if (com==2 && user==2) System.out.print("사용자: 바위, 컴퓨터: 바위\n비겼습니다.\n");
				if (com==2 && user==3) System.out.print("사용자: 보, 컴퓨터: 바위\n비겼습니다.\n");
				
				if (com==3 && user==1) System.out.print("사용자: 가위, 컴퓨터: 보\n비겼습니다.\n");
				if (com==3 && user==2) System.out.print("사용자: 바위, 컴퓨터: 보\n비겼습니다.\n");
				if (com==3 && user==3) System.out.print("사용자: 보, 컴퓨터: 보\n비겼습니다.\n");
				
				
				//승부판단로직2
				System.out.printf("");
				switch (user - com) {
				case 0:
					System.out.println("비겼습니다"); break;
				case 1: case -2:
					System.out.println("이겼습니다"); break;
				case 2: case -1:
					System.out.println("졌습니다"); break;
				}
				
				
				gameCount++; //게임카운트 증가
			}
			else {
				System.out.println("제대로 내세요!!");
			}
			
			//4. 게임재시작 여부 확인
			if (gameCount>=5) {
				
				int restart = 1;
				try {
					//0과 1을 입력하지 않아도 게임은 재시작된다.
					System.out.print("게임재시작(1), 종료(0): ");
					restart = scanner.nextInt();
				}
				catch (InputMismatchException e) {
					System.out.println("[예외발생]숫자만 입력하세요");
				}
				
				if (restart==0) {
					//게임종료를 위해 while루프 탈출
					break;
				}
				else {
					System.out.println("게임재시작!");
					gameCount =0;
				}
				System.out.println();
				
				
			}
		}
	}
}
