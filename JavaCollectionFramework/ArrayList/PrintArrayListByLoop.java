//Write a Java program to print all the elements of an ArrayList using the elements' position.
import java.util.ArrayList;
class PrintArrayListByLoop{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(34);
		al.add(56);
		al.add(67);
		al.add(78);
		System.out.println("All Elements By For Loop");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}