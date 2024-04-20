//Write a Java program to iterate TreeSet collection in ascending order
import java.util.TreeSet;
class AsscendingOrder{
	public static void main(String[] args){
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(23);
		ts.add(78);
		ts.add(36);
		ts.add(73);
		ts.add(52);
		ts.add(68);
		System.out.println("TreeSet : "+ts);
	}
}