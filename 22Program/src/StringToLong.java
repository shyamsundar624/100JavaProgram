
public class StringToLong {
	public static void main(String[] args) {
		String str = "233";
		long longVal = Long.parseLong(str);
		System.out.println(longVal);
		if(str instanceof String) {
		System.out.println("String Type data value "+str);	
		}
	}
}
