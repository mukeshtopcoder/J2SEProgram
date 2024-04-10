//Write a Java program to iterate Vector collection using the iterator() method
import java.util.Vector;
import java.util.Iterator;
class IterateElements{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(72);
		vc.add(35);
		Iterator it = vc.iterator();
		System.out.print("Vector Elements : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}