package Pdf_Questions;

import java.time.LocalDate;

public class DateTest {
	public static void main(String[] args) 
	{
		LocalDate dt=LocalDate.of(2012,01,32);
		dt.plusDays(10);
		System.out.println(dt);
	}		

}
