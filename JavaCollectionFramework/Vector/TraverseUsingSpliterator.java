//Write a Java program to traverse the Vector collection using spliterator() method
import java.util.Vector;
import java.util.Spliterator;
class TraverseUsingSpliterator{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(46);
		vc.add(26);
		vc.add(24);
		vc.add(62);
		vc.add(28);
		vc.add(41);
		Spliterator<Integer> sp = vc.spliterator();
		System.out.print("Our Vector : ");
		while(sp.tryAdvance((element)->System.out.print(element+" ")));
	}
}