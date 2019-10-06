package lambda.expressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

	public static void main(String[] args) {
		List<String> names =  Arrays.asList( "Igor", "Maxwell", "Peter", "James");
		Comparator<String> compare = (a,b) -> Integer.compare(a.length(), b.length()) ;
		names.sort(compare);
		System.out.println(names);
		
		List<String> lastNames =  Arrays.asList( "Modolo", "Peterle", "Braz");
		lastNames.sort((a,b) -> Integer.compare(a.length(), b.length()));
		System.out.println(lastNames);
	}

}
