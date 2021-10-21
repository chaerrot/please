package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E05LocalDateTime
{

	public static void main(String[] args)
	{
		
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜: "+ localDate);
		
		LocalDate localTime = LocalDate.now();
		System.out.println("현재시간: "+ localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("지금이순간: "+ localDateTime);
		
		DateTimeFormatter fotmat1 = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
		DateTimeFormatter fotmat2 = DateTimeFormatter.ofPattern("HH시mm분ss초");
		DateTimeFormatter fotmat3 = DateTimeFormatter
				.ofPattern("오늘은 yyyy년의 w주차, D번째날");
		DateTimeFormatter fotmat4 = DateTimeFormatter
				.ofPattern("오늘은 M월의 W번째주, d번째날, F번째 E요일");
		System.out.println("서식1: "+ localDateTime.format(fotmat1));
		System.out.println("서식2: "+ localDateTime.format(fotmat2));
		System.out.println("서식3: "+ localDateTime.format(fotmat3));
		System.out.println("서식4: "+ localDateTime.format(fotmat4));
		
		System.out.println("현재년: "+ localDate.getYear());
		System.out.println("현재월: "+ localDate.getMonth());
		System.out.println("현재일: "+ localDate.getDayOfMonth());
		System.out.println("현재요일: "+ localDate.getDayOfWeek());
		
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		System.out.println("올해 크리스마스까지...");
		
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() +"개월 "+ period.getDays()+ "일 남음");
		
		System.out.println(ChronoUnit.MONTHS.between(localDateTime, xMas)
				+ "개월 남음");
		
		System.out.println(ChronoUnit.DAYS.between(localDateTime, xMas)
				+ "일 남음");
		
		System.out.println("어제: "+ localDateTime.minusDays(1));
		System.out.println("내일: "+ localDateTime.plusDays(1));
		
		
	}

}
