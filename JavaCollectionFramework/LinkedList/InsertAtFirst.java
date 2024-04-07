//Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;
import java.util.Scanner;
class InsertAtFirst{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		list.add(43);
		list.add(65);
		list.add(67);
		list.add(41);
		list.add(45);
		list.add(89);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter Element : ");
		int num = sc.nextInt();
		list.addFirst(num);
		System.out.print("Updated LinkedList : "+list);
	}
}