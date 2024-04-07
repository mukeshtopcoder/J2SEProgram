//Write a Java program to append the specified element to the end of a linked list.
import java.util.LinkedList;
class AddElementAtLast{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(54);
		list.add(45);
		list.add(27);
		list.add(38);
		System.out.print("LinkedList : "+list);
		list.addLast(99);
		System.out.print("\nAfter Add Element At Last : "+list);
	}
}