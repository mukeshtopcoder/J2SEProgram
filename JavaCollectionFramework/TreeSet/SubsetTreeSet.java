//Write a Java program to get the subset of a TreeSet collection based on a specified range.
import java.util.TreeSet;
class SubsetTreeSet{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(45);
		ts.add(67);
		ts.add(78);
		ts.add(54);
		ts.add(25);
		ts.add(17);
		System.out.println("TreeSet : "+ts);
		System.out.println("SubSet : "+ts.subSet(25,67));
		System.out.println("TreeSet : "+ts.subSet(25,false,67,true));
	}
}