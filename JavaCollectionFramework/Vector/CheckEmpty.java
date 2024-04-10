//Write a Java program to check whether a Vector collection is empty or not
import java.util.Vector;
class CheckEmpty{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(72);
		vc.add(35);
		System.out.println("Our Vector : "+vc);
		vc.clear();
		System.out.println("Cleared Vector : "+vc);
		System.out.println("Is Vector Empty : "+vc.isEmpty());
	}
}