import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
public static void main(String[] args) {
	Date date=new Date();
	
	System.out.println(date);
	
	SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
	String strDate = formatter.format(date);
	
	formatter=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	strDate = formatter.format(date);
	
	formatter=new SimpleDateFormat("dd MMMM yyyy");
	strDate = formatter.format(date);
	System.out.println(strDate);
}
}
