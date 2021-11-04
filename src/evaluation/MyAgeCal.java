package evaluation;

import java.util.Calendar;

public class MyAgeCal
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		int birthYear= 1994;
		int nowYear= cal.get(Calendar.YEAR);
		int myAge= nowYear - birthYear;
		
		System.out.println("내 나이는 "+ myAge +"살입니다.");
		
	}
}
