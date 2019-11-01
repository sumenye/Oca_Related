package Pdf_Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014,5,20);
		LocalDate date3 = LocalDate.parse("2014-06-20",DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		//LocalDateTime dt=LocalDateTime.of(2014, 7,31,1,1);
//System.out.println(dtformat (DateTimeFormatter.ISO_DATE));
	}

//	private static char[] dtformat(DateTimeFormatter isoDate) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
