//Write a Java program to test whether an array list is empty or not.
import java.util.ArrayList;
class IsEmptyOrNot{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(35);
		al.add(67);
		al.add(45);
		al.add(34);
		al.add(59);
		System.out.print("\nArrayList : "+al);
		al.clear();
		System.out.print("\nAfter Clear ArrayList : "+al);
		System.out.print("\nArrayList is Empty :  "+al.isEmpty());
	}
}