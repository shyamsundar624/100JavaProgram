
public class Test {
public static void main(String[] args) {
	System.out.println(getIndex("abcabc"));
}

/*
 * String s="abcfaf'1
 * 
 */
public static int getIndex(String s) {
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(s.indexOf(c)==s.lastIndexOf(c)) {
			return i;
		}
	}
	return -1;
}

}
