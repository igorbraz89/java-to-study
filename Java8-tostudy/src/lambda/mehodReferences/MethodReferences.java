package lambda.mehodReferences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodReferences {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Igor", "Bruno", "Victor");
		names.forEach(System.out::println);
		
		Map<String, String> dogs = createDogMapSample();
		testMethodReferenceForPut(dogs);
		System.out.println(dogs);
	}

	private static void testMethodReferenceForPut(Map<String, String> dogs) {
		Map<String, String> myDoggos = new HashMap<String, String>();  
		dogs.forEach(myDoggos::put);
	}

	private static Map<String, String> createDogMapSample() {
		Map<String, String> dogs = new HashMap<String, String>();
	
		dogs.put("Chulin", "First and best friend");
		dogs.put("Romario", "Crazy guy but good boy");
		dogs.put("Cherrie", "Beautifull lady and the smartest dog ever");
		return dogs;
	}
}
