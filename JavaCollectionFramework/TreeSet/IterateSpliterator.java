//Write a Java program to access elements from TreeSet Collection using spliterator() method
import java.util.TreeSet;
import java.util.Spliterator;
class IterateSpliterator{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(89);
		ts.add(79);
		ts.add(86);
		ts.add(46);
		ts.add(73);
		ts.add(42);
		System.out.println("TreeSet : "+ts);
		Spliterator<Integer> sp = ts.spliterator();
		System.out.println("Elements of TreeSet : ");
		sp.forEachRemaining(System.out::println);
	}
}