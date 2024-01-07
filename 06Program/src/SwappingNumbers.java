import java.util.Scanner;

public class SwappingNumbers {
public static void main(String[] args) {
	int num1, num2;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter two Numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	System.out.println("Before Swapping Num1 and Num2 "+num1+" "+num2);
	
	num1=num1+num2;//num1=12+14=26
	num2=num1-num2;//num2=26-14=12
	num1=num1-num2;//num1=26-12=14
	System.out.println("After Swapping Num1 and Num2 "+num1+" "+num2);
}
}
