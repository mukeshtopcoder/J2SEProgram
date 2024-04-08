//Write a Java program to compare two linked lists.
import java.util.LinkedList;
class CompareTwoLinkedList{
	public static void main(String[] args)
	{
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(2);
		list1.add(4);
		list1.add(3);
		list1.add(7);
		list1.add(6);
		list1.add(5);
		list2.add(2);
		list2.add(5);
		list2.add(4);
		list2.add(7);
		list2.add(0);
		list2.add(8);
		list2.add(9);
		System.out.println("1st LinkedList : "+list1);
		System.out.println("2nd LinkedList : "+list2);
		System.out.println("1st LinkedList Size : "+list1.size());
		System.out.println("2nd LinkedList Size : "+list2.size());
		int count=0;
		for(int i=0;i<list1.size();i++)
			for(int j=0;j<list2.size();j++)
				if(list1.get(i)==list2.get(j))
					count++;
		System.out.print("Total Items Matched : "+count);
	}
}