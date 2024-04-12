//Write a Java program to check whether a Stack collection is empty or not
import java.util.Stack;
class CheckEmpty{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		st.push(23);
		st.push(36);
		st.push(67);
		st.push(27);
		st.push(49);
		st.push(73);
		System.out.println("Our Stack : "+st);
		st.clear();
		System.out.println("After Empty Our Stack : "+st);
		System.out.println("Is Stack Empty : "+st.isEmpty());
	}
}