import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetEvenNumber {
public static void main(String[] args) {
	List<Integer> asList =Arrays.asList(12,37,11,34,44,77);
	List<Integer> collect = asList.stream().filter(a-> a%2!=0).collect(Collectors.toList());
	System.out.println(collect);
	
}
}
