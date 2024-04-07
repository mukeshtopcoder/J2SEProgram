//Write a Java program to remove a specified element from a linked list.
import java.util.LinkedList;
import java.util.Scanner;
class RemoveElement{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(23);
		list.add(56);
		list.add(34);
		list.add(86);
		list.add(43);
		list.add(73);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter Index To Delete Element : ");
		int index = sc.nextInt();
		if(index<list.size())
			list.remove(index);
		System.out.print("Updated LinkedList : "+list);
	}
}