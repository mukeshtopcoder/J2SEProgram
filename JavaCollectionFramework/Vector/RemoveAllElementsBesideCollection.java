//Write a Java program to remove all elements of Vector collection that do not contain in the specified collection
import java.util.Vector;
class RemoveAllElementsBesideCollection{
	public static void main(String[] args){
		Vector<Integer> vc1 = new Vector<>();
		Vector<Integer> vc2 = new Vector<>();
		vc1.add(12);
		vc1.add(34);
		vc1.add(56);
		vc1.add(34);
		vc1.add(86);
		vc1.add(54);
		vc1.add(42);
		vc1.add(56);
		vc2.add(34);
		vc2.add(24);
		vc2.add(12);
		vc2.add(45);
		vc2.add(75);
		vc2.add(36);
		vc2.add(45);
		vc2.add(25);
		System.out.println("Our 1st Vector : "+vc1);
		System.out.println("Our 2nd Vector : "+vc2);
		vc1.retainAll(vc2);
		System.out.println("Our 1st Vector : "+vc1);
	}
}