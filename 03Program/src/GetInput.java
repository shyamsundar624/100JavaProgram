import java.util.Scanner;

public class GetInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s;
	int i;
	float f;
	
	System.out.println("Enter a String");
	s=sc.nextLine();
	System.out.println("You ENteres String Is "+s);
	
	System.out.println("Enter an Integer");
	i=sc.nextInt();
	System.out.println("You ENtered Int Is "+i);
	
	System.out.println("Enter a Float");
	f=sc.nextFloat();
	System.out.println("You Entered Float is "+f);
	
}
}
