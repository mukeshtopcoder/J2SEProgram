//Write a Java program to copy/clone a linked list to another linked list.
import java.util.LinkedList;
class CloneLinkedList{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(55);
		list.add(26);
		list.add(78);
		list.add(62);
		list.add(53);
		LinkedList cloneList = (LinkedList)list.clone();
		System.out.println("Our LinkedList : "+list);
		System.out.println("Cloned LinkedList : "+cloneList);
	}
}