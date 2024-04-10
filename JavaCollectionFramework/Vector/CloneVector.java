//Write a Java program to create a clone of a Vector collection
import java.util.Vector;
class CloneVector{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(12);
		vc.add(43);
		vc.add(98);
		vc.add(76);
		vc.add(65);
		System.out.println("Our Vector : "+vc);
		Vector vec = (Vector)vc.clone();
		System.out.println("Our Cloned Vector : "+vec);
	}
}