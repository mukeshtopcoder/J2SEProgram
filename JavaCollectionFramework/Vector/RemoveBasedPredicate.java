//Write a Java program to remove elements from Vector collection based on a specified predicate
import java.util.Vector;
class RemoveBasedPredicate{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(72);
		vc.add(12);
		vc.add(34);
		vc.add(33);
		System.out.println("Our Vector : "+vc);
			vc.removeIf(val->(val<=35));
		System.out.println("Our Vector : "+vc);
	}
}