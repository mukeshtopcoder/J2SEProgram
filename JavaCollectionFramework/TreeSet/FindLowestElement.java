//Write a Java program to get and remove the lowest element from the TreeSet collection
import java.util.TreeSet;
class FindLowestElement{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(34);
		ts.add(67);
		ts.add(84);
		ts.add(46);
		ts.add(83);
		ts.add(63);
		ts.add(56);
		System.out.println("TreeSet : "+ts);
		int min = ts.first();
		System.out.println("Minimum Number : "+min);	
		System.out.println("TreeSet : "+ts);	
	}
}