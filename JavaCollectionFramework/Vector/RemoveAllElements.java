//Write a Java program to remove all elements of Vector collection
import java.util.Vector;
class RemoveAllElements{
	public static void main(String[] args)
	{
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(87);
		vc.add(56);
		vc.add(37);
		vc.add(64);
		System.out.println("Our Vector : "+vc);
		System.out.println("After Removed Elements");
		vc.clear();
		System.out.println("Our Vector : "+vc);
	}
}