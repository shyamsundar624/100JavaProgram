import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CureentDate {
public static void main(String[] args) {
	LocalDate date=LocalDate.now();
	
	System.out.println("Current Date "+date);
	
	int dayOfMonth = date.getDayOfMonth();
	System.out.println(dayOfMonth);
	int monthValue = date.getMonthValue();
	System.out.println(monthValue);
	
	Month month = date.getMonth();
	System.out.println(month);
	
	DayOfWeek dayOfWeek = date.getDayOfWeek();
	System.out.println(dayOfWeek);
	
	int year = date.getYear();
	System.out.println(year);
}
}
