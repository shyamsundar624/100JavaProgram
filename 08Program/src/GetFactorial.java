import java.util.Scanner;

public class GetFactorial {
public static void main(String[] args) {
	/* num=4
	 * 1*1=1
	 * 1*2=2
	 * 2*3=6
	 * 6*4=24
	 * 
	 */
	
	int num,itr,fact=1;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number to Get Factorial");
	num=sc.nextInt();
	if(num<0) {
		System.out.println("Number should be non-Negative");
	}else {
	for(itr=1;itr<=num;itr++) {
		fact=fact*itr;
	}
	
	System.out.println("Factorial of "+num+" is "+fact);
	}
}
}
