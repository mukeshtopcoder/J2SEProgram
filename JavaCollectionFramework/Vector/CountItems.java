//Write a Java program to count the items of a Vector collection
import java.util.Vector;
class CountItems{
	public static void main(String[] args)
	{
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(87);
		vc.add(56);
		vc.add(37);
		vc.add(64);
		int count=0;
		for(Integer i : vc)
			count++;
		System.out.print("Items in Vector : "+count);
	}
}