//Write a Java program to Create the clone of the TreeSet collection
import java.util.TreeSet;
class TreeSetClone{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(34);
		ts.add(67);
		ts.add(47);
		ts.add(56);
		ts.add(26);
		ts.add(85);
		ts.add(47);
		ts.add(96);
		TreeSet tsClone = (TreeSet)ts.clone();
		System.out.println("TreeSet : "+ts);
		System.out.println("Clone TreeSet : "+tsClone);
	}
}