//Write a Java program to join two array lists
import java.util.ArrayList;
import java.util.Iterator;
class JoinTwoArrayList{
	public static void main(String[] args)
	{
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		al1.add(23);
		al1.add(45);
		al1.add(77);
		al1.add(46);
		al1.add(47);
		al1.add(23);
		al2.add(47);
		al2.add(45);
		al2.add(82);
		al2.add(72);
		al2.add(28);
		al2.add(36);
		Iterator it1 = al1.iterator();
		System.out.print("\nElements of 1st ArrayList : ");
		while(it1.hasNext())
			System.out.print(it1.next()+" ");
		Iterator it2 = al2.iterator();
		System.out.print("\nElements of 2nd ArrayList : ");
		while(it2.hasNext())
			System.out.print(it2.next()+" ");
		al1.addAll(al2);
		it1 = al1.iterator();
		System.out.print("\nElements of 1st ArrayList After Addition : ");
		while(it1.hasNext())
			System.out.print(it1.next()+" ");
	}
}