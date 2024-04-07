//Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class GetElementFromIndex{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		al.add("Hello");
		al.add("India");
		al.add("World");
		al.add("Mumbai");
		al.add("Goa");
		System.out.println("Your Elements Are Here\n");
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.println(it.next()+" ");
		System.out.print("\nEnter Position To Get ELement : ");
		int index = sc.nextInt();
		System.out.println("\nYour Element Here : "+al.get(index));
	}
}