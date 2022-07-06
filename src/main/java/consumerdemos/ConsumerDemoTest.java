package consumerdemos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoTest {

	public static void main(String[] args) {
		
		Consumer<Person> c = new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		c = p1 -> p1.setAge(p1.getAge()+10);

		Consumer<Integer> c1= number -> Math.sqrt(number);
		c1.accept(144);
		System.out.println(c1);
		
		List<Integer> li = Arrays.asList(1,2,3,4,5);	
		Consumer<List<Integer>> cons = ConsumerDemoTest :: printValues;
		cons.accept(li);
		
	}
	
	public static void printValues(List<Integer> list){
		for(Integer i : list){
			System.out.println("i value is "+ i +" square is "+ (i*i));
		}
	}

}
