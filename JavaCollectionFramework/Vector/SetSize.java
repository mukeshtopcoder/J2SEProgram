//Write a Java program to change the size of a Vector collection
import java.util.Vector;
class SetSize{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(22);
		vc.add(45);
		vc.add(54);
		vc.add(62);
		vc.add(56);
		vc.add(87);
		vc.add(92);
		System.out.println("Our Vector : "+vc);
		System.out.println("Size of Vector : "+vc.size());vc.setSize(100);
		System.out.print("After Change Size of Vector : "+vc.size());
	}
}