//Write a Java program to iterate TreeSet collection in descending order
import java.util.TreeSet;
import java.util.Iterator;
class DescendingOrder{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(65);
		ts.add(38);
		ts.add(65);
		ts.add(27);
		ts.add(15);
		ts.add(93);
		System.out.println("TreeSet : "+ts);
		Iterator it = ts.descendingIterator();
		System.out.print("TreeSet in Descending Order : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}