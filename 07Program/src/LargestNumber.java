import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	int num1,num2,num3;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 Numbers");
	
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	
	if(num1>num2 && num1>num3) {
		System.out.println("First Number is Largest");
	}else if(num2>num1 && num2>num3) {
		System.out.println("Second Number is Largest");
		
	}else if(num3>num1 && num3>num2) {
		System.out.println("Third Number is Largest");
		
	}else {
		System.out.println("Entered Numbers are not Distinct");
	}
}
}
