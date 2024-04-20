//Write a Java program to add non-common elements of one TreeSet into another TreeSet collection.
import java.util.TreeSet;
import java.util.Iterator;
class CopyNonCommonElements{
	public static void main(String[] args){
		TreeSet<Integer> ts1 = new TreeSet<>();
		TreeSet<Integer> ts2 = new TreeSet<>();
		ts1.add(23);
		ts1.add(45);
		ts1.add(36);
		ts1.add(25);
		ts1.add(24);
		ts1.add(21);
		ts2.add(46);
		ts2.add(24);
		ts2.add(13);
		ts2.add(24);
		ts2.add(45);
		ts2.add(23);
		ts2.add(15);
		System.out.println("TreeSet 1 : "+ts1);
		System.out.println("TreeSet 1 : "+ts2);
		Iterator it = ts2.iterator();
		while(it.hasNext())
		{
			int num = (int)it.next();
			if(!ts1.contains(num))
				ts1.add(num);
		}
		System.out.println("TreeSet 1 After Adding Elements From TreeSet 2 : "+ts1);
	}
}