//Write a Java program to Get and Remove the largest element from the TreeSet collection
import java.util.TreeSet;
import java.util.Iterator;
class FindLargestNumber{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(54);
		ts.add(99);
		ts.add(78);
		ts.add(74);
		ts.add(36);
		ts.add(26);
		Iterator it = ts.descendingIterator();
		System.out.println("TreeSet : "+ts);
		int max = (int)it.next();
		System.out.println("Maximum Number : "+max);
		ts.remove(max);
		System.out.println("TreeSet : "+ts);
	}
}