import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a;
	float f;
	String s;
	System.out.println("Enter a String");
	s=sc.nextLine();
	System.out.println("You Entered String is "+s);
	System.out.println("Enter an Integer");
	a=sc.nextInt();
	System.out.println("You Entered Integer is "+a);
	
	System.out.println("Enter a FLoat");
	f=sc.nextFloat();
	System.out.println("You Entered Float Is "+f);
}
}
