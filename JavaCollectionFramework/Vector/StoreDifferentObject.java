//Write a Java program to create a vector to store different types of objects
import java.util.Vector;
class StoreDifferentObject{
	public static void main(String[] args){
		Vector<Object> vc = new Vector<>();
		vc.add("Rakesh");
		vc.add(35);
		vc.add(23.56);
		vc.add('B');
		vc.add(true);
		System.out.println("---Different Objects From Vector");
		for(Object obj : vc)
			System.out.println(obj);
	}
}