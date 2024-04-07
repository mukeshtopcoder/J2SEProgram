//Write a Java program to empty an array list.
import java.util.ArrayList;
class EmptyArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(35);
		al.add(57);
		al.add(62);
		al.add(58);
		al.add(82);
		al.add(47);
		System.out.print("\nArrayList : "+al);
		al.clear();
		System.out.print("\nAfter Clear ArrayList : "+al);
	}
}