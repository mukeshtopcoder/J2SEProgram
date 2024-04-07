//Write a Java program to remove all elements from a linked list.
import java.util.LinkedList;
class RemoveAllElements{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(56);
		list.add(42);
		list.add(89);
		list.add(45);
		list.add(87);
		System.out.println("Our LinkedList : "+list);
		list.clear();
		System.out.println("Removed All Elements\nUpdated LinkedList : "+list);
	}
}