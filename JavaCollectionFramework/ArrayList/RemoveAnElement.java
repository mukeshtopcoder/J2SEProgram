//Write a Java program to remove the third element from an array list.
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
class RemoveAnElement{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		al.add("C-Language");
		al.add("C++");
		al.add("Java");
		al.add("C-Sharp");
		al.add("Java-Script");
		System.out.println("\nYour Elements Are Here");
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.print("Enter Index To Delete Element : ");
		int index = sc.nextInt();
		al.remove(index);
		System.out.println("\nYour Updated Elements Are Here");
		it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}