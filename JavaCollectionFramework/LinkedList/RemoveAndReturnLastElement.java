//Write a Java program to remove and return the last element of a linked list.
import java.util.LinkedList;
class RemoveAndReturnLastElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(75);
		list.add(54);
		list.add(53);
		list.add(87);
		System.out.println("Our LinkedList : "+list);
		System.out.println("Our Last Element : "+list.get(list.size()-1));
		list.removeLast();
		System.out.println("Update LinkedList : "+list);
	}
}