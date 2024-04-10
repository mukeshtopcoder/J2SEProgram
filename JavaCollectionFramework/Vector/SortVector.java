//Write a Java program to sort the elements of a Vector collection
import java.util.Vector;
import java.util.Collections;
class SortVector{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(46);
		vc.add(26);
		vc.add(24);
		vc.add(62);
		vc.add(28);
		vc.add(41);
		System.out.println("Our Vector : "+vc);
		Collections.sort(vc);
		System.out.println("Sorted Vector : "+vc);
	}
}