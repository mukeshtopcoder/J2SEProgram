//Write a Java program to shuffle elements in a linked list.
import java.util.LinkedList;
import java.util.Collections;
class ShuffleElements{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(34);
		list.add(67);
		list.add(35);
		list.add(56);
		list.add(82);
		list.add(38);
		System.out.println("Our LinkedList : "+list);
		Collections.shuffle(list);
		System.out.println("Our LinkedList : "+list);
	}
}