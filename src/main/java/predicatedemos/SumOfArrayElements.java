package predicatedemos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Predicate<Integer> ip = number -> number > 2;             
		
		long value = li.stream()
		   .filter(ip)
		   .mapToInt(number -> number *2)
		   .sum();
		System.out.println("value is "+ value);
		
		BinaryOperator<Integer> bo = (a,b) -> a+b;

//		
		li.stream()
		  .reduce(0, (a,b) -> a+b);
		
		li.stream()
		  .mapToInt(n -> Integer.valueOf(n))
		  .sum();
		  
		
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
