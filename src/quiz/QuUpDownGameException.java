package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGameException
{
	
	
	public static void upDownGameStart() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int restart;
		boolean forEnd = false;
		
		while (true) {
			
			int computerNum = random.nextInt(10000) % 100 +1; //1~100까지 랜덤으로 
			System.out.println("컴퓨터가 생성한 난수: "+ computerNum);
		}
		
	}

	public static void main(String[] args)
	{
		
		UpDownGameStart();
		
	}

}
