//Write a Java program to Reverse Linked List using Stack
import java.util.LinkedList;
import java.util.Stack;
class ReverseLinkedListUsingStack{
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		list.add(23);
		list.add(67);
		list.add(63);
		list.add(46);
		list.add(72);
		System.out.println("Our LinkedList : "+list);
		for(int i=0;i<list.size();i++)
			st.push(list.get(i));
		System.out.print("Reverse Using Stack : ");
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
	}
}