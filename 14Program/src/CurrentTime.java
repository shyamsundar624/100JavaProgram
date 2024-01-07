import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentTime {
public static void main(String[] args) {
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	int hour = time.getHour();
	System.out.println(hour);
	
	int minute = time.getMinute();
	System.out.println(minute);
	
	int second = time.getSecond();
	System.out.println(second);
	
	int nano = time.getNano();
	System.out.println(nano);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime);
}
}
