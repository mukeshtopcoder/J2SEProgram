//Write a Java program to replace an element in a linked list.
import java.util.Scanner;
import java.util.LinkedList;
class ReplaceElement{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		list.add(23);
		list.add(45);
		list.add(67);
		list.add(35);
		list.add(74);
		list.add(27);
		System.out.println("Our LinkedList : "+list);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		System.out.print("Enter Index To Enter Number : ");
		int index = sc.nextInt();
		if(index<list.size())
			list.set(index,num);
		System.out.print("Updated LinkedList : "+list);
	}
}