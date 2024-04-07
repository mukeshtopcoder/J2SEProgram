//Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class ShuffleArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(67);
		al.add(45);
		al.add(34);
		al.add(36);
		al.add(57);
		al.add(33);
		Iterator it = al.iterator();
		System.out.print("Your Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
		Collections.shuffle(al);
		it = al.iterator();
		System.out.print("\nYour Shuffled Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}