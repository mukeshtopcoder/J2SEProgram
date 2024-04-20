//Write a Java program to create a TreeSet collection using List collection
import java.util.ArrayList;
import java.util.TreeSet;
class ListToTreeSet{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(87);
		al.add(63);
		al.add(57);
		al.add(16);
		al.add(58);
		al.add(37);
		al.add(95);
		System.out.println("ArrayList : "+al);
		TreeSet<Integer> ts = new TreeSet<>(al);
		System.out.println("TreeSet  :  "+ts);
	}
}