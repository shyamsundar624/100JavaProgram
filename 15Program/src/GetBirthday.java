import java.time.LocalDate;
import java.time.Period;

public class GetBirthday {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	
	LocalDate birthday = LocalDate.of(2000,11,26); 
	
	Period p = Period.between(birthday, today);
	
	System.out.println(p.getDays()+" Days "+p.getMonths()+" Months "+p.getYears()+" Years");
	
}
}
