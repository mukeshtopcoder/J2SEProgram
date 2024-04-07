//Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;
class SwapTwoElements{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(34);
		al.add(56);
		al.add(78);
		al.add(58);
		al.add(23);
		al.add(12);
		al.add(69);
		Iterator it = al.iterator();
		System.out.print("Elements of Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
		int temp = al.get(2);
		al.set(2,al.get(3));
		al.set(3,temp);
		it = al.iterator();
		System.out.print("\nSwaped index 2,3 of Array List : ");
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}