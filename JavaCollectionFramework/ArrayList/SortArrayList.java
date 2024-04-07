//Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
class SortArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(56);
		al.add(45);
		al.add(36);
		al.add(13);
		Iterator it = al.iterator();
		System.out.print("Your Array List :  ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
		Collections.sort(al);
		it = al.iterator();
		System.out.print("\nYour Sorted Array List :  ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}