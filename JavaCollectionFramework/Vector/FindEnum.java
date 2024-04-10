//Write a Java program to get the enumeration of the values present in the Vector
import java.util.Vector;
import java.util.Enumeration;
class FindEnum{
	public static void main(String[] args){
		Vector<Integer> vc = new Vector<>();
		Enumeration en = vc.elements();
		vc.add(62);
		vc.add(82);
		vc.add(52);
		vc.add(79);
		vc.add(42);
		System.out.println("Our Vector : "+vc);
		System.out.print("Our Enumeration : ");
		while(en.hasMoreElements())
			System.out.print(en.nextElement()+" ");
	}
}