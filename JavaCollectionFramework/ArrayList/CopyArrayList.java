//Write a Java program to copy one array list into another.
import java.util.ArrayList;
import java.util.Iterator;
class CopyArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> cp = new ArrayList<>();
		al.add(34);
		al.add(64);
		al.add(45);
		al.add(54);
		al.add(36);
		Iterator it = al.iterator();
		System.out.print("Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		cp.addAll(al);
		it = cp.iterator();
		System.out.print("\nCopied Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+"  ");
	}
}