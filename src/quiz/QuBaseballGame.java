package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuBaseballGame
{

	public static void main(String[] args)
	{
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int min = 1;
		int max = 9;
		for (int i=1; i<=3; i++) {
			int randomball = (int) (Math.random() * (max - min) + min);
			System.out.print(randomball+ " ");
		}
		
		System.out.print("3개의 숫자를 입력하세요(스페이스로 구분): ");
		int input = scanner.nextInt();
		
		int com1, com2, com3;
		int user1, user2, user3;
		   
		   
		   
		int[] com = new int[3];
		int[] user = new int[3];
		   
	}

}
