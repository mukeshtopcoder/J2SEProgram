//Write a Java program for trimming the capacity of an array list.
import java.util.ArrayList;
class TrimCapacityOfArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(65);
		al.add(67);
		al.add(84);
		al.add(93);
		al.trimToSize();
		System.out.print(al);
	}
}