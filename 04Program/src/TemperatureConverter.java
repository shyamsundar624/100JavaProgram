import java.util.Scanner;

/*
 * Celsius= ((Fahrenheit−32)*5)/9
 */
public class TemperatureConverter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	double temp;
	
	System.out.println("Enter Temperature in Fahrenheit");
	temp=sc.nextDouble();
	
	temp=((temp-32)*5)/9;
	
	System.out.println("Temperature In Celsius "+temp);
	
}
}
