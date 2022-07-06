package predicatedemos;

@FunctionalInterface
public interface MyInter<T> {

	boolean test(T t);
}
