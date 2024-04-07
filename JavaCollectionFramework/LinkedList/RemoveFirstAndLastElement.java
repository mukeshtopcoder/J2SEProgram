//Write a Java program to remove the first and last elements from a linked list
import java.util.LinkedList;
class RemoveFirstAndLastElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(32);
		list.add(45);
		list.add(26);
		list.add(75);
		list.add(42);
		list.add(74);
		System.out.println("Our LinkedList : "+list);
		list.removeFirst();
		list.removeLast();
		System.out.println("Removed First And Last Elements\nUpdated LinkedList : "+list);
	}
}