//Write a Java program to increase an array list size.
import java.util.ArrayList;
class IncreaseCapacity{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(34);
		al.add(45);
		al.add(67);
		al.ensureCapacity(500);
		System.out.println("Our ArrayList : "+al);
		System.out.print("You Can Add 500 Elements Now!");
	}
}