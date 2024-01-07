import java.util.Scanner;

public class NumberSwapping {
public static void main(String[] args) {
	
	int num1,num2,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	System.out.println("Before Swapping Num1 & Num2 "+num1+" "+num2);
	
	temp=num1;//num1=12, temp=12
	num1=num2;//num1=14
	num2=temp;//num2=12
	System.out.println("After Swapping Num1 & Num2 "+num1+" "+num2);
}
}
