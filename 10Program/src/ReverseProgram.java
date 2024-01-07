import java.util.Scanner;

public class ReverseProgram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num, rev=0;
	System.out.println("Enter a Number");
	num=sc.nextInt();
	
	while(num!=0) {
		rev=rev*10;
		rev=rev+ num%10;
		num=num/10;
	}
	System.out.println("Revesed Numbered "+rev);
}
}
