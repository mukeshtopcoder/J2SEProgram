//Write a Java program to add elements of a Vector to other Vector collection
import java.util.Vector;
class AddCollection{
	public static void main(String[] args){
		Vector<Integer> vc1 = new Vector<>();
		Vector<Integer> vc2 = new Vector<>();
		vc1.add(33);
		vc1.add(36);
		vc1.add(57);
		vc1.add(78);
		vc1.add(84);
		vc2.add(2);
		vc2.add(3);
		vc2.add(9);
		vc2.add(3);
		vc2.add(8);
		System.out.println("Our 1st Vector : "+vc1);
		System.out.println("Our 1st Vector : "+vc2);
		vc1.addAll(vc2);
		System.out.println("Updated 1st Vector : "+vc1);
	}
}