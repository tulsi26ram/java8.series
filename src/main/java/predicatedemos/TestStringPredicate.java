package predicatedemos;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStringPredicate {

	public static void main(String[] args) {
		
		String [] names = {"Harish","Ravi","Rajesh","kiran","Ramu"};
		
		Predicate<String> p = name -> name.length() == 4;
		
		for(String n : names){
			System.out.println(p.and(name -> name.startsWith("R")).test(n));
			System.out.println(" Or predicate "+ p.or(name -> name.endsWith("U")).test(n));
		}

		 
		Stream<String> s = Stream.of(names);
		System.out.println("list is "+s.filter(p.and(person -> person.startsWith("R")))
		 .collect(Collectors.toList()));
	
		System.out.println(p.test("Rajesh"));
		
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
