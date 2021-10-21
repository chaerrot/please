package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int gameCount = 0;
		
		
		//1. 난수생성 - 컴퓨터 입장에서 가위/바위/보
		int com = random.nextInt(10000) % 3 + 1; //1~3사이의 난수
		System.out.println("컴퓨터: "+ com);
		
		//2. 사용자입력
		int user = 0;
		System.out.println("가위바위보를 입력하세요.");
		System.out.print("가위(1), 바위(2), 보(3) => ");
		user = scanner.nextInt();
		
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
			
			System.out.println();
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
