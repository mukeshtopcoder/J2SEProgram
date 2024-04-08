//Write a Java program to convert a linked list to an array list.
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
class ConvertLinkedListToArrayList{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(24);
		list.add(75);
		list.add(63);
		list.add(43);
		list.add(19);
		list.add(73);
		System.out.print("Our LinkedList : "+list);
		List<Integer> al = new ArrayList<>(list);
		System.out.print("\nOur ArrayListList : "+al);
	}
}