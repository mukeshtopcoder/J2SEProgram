//Write a Java program to retrieve, but not remove, the last element of a linked list.
import java.util.LinkedList;
class PrintLastElementButNotRemove{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(67);
		list.add(45);
		list.add(73);
		list.add(56);
		list.add(82);
		System.out.println("Our LinkedList : "+list);
		System.out.println("LinkedList Last Element : "+list.getLast());
		System.out.println("Our LinkedList : "+list);
	}
}