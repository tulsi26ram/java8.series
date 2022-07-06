package predicatedemos;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = number -> number > 10 && number %2 == 0;

		System.out.println(p.negate().test(21));
		
		
		Predicate<Person> p1 = person -> person.getAge() > 23 && person.getGender().equals("FeMale");
		System.out.println(p1.test(new Person(25,"Harish", "Male")));
		System.out.println(p1.and(person -> person.getName().equals("kiran")).test(new Person(24,"kiran","Female")));
		
		
		Predicate<Integer> p2  = (number1) -> number1 == 10;
		System.out.println(p2.test(10));
		
		
		Runnable r  = () -> System.out.print("hello");
		r.run();
		
	}

}
