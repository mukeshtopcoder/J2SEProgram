//Write a Java program to clone an array list to another array list.
import java.util.ArrayList;
import java.util.Iterator;
class CloneArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al3 = new ArrayList<>();
		al1.add(43);
		al1.add(56);
		al1.add(36);
		al1.add(41);
		al1.add(49);
		al1.add(45);
		al1.add(87);
		ArrayList al2=(ArrayList)al1.clone();
		System.out.print("\nYour First ArrayList : ");
		Iterator it1 = al1.iterator();
		while(it1.hasNext())
			System.out.print(it1.next()+" ");
		System.out.print("\nYour Second ArrayList : ");
		Iterator it2 = al2.iterator();
		while(it2.hasNext())
			System.out.print(it2.next()+" ");
	}
}