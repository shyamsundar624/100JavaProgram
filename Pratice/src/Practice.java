import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//38
public class Practice {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,23,14,55,66,7,8);
	 asList.stream().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);
	 
		
	}
}
 