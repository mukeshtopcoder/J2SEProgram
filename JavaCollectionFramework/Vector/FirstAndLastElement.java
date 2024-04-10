//Write a Java program to get the first element of Vector using the firstElement() method and last element using lastElement() method
import java.util.Vector;
class FirstAndLastElement{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		vc.add(23);
		vc.add(45);
		vc.add(46);
		vc.add(72);
		vc.add(35);
		System.out.println("Our Vector : "+vc);
		System.out.println("First Element : "+vc.firstElement());
		System.out.println("Last Element : "+vc.lastElement());
	}
}