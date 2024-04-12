//Write a Java program to create a stack using Stack collection
//Write a Java program to create a stack with hybrid items using Stack collection
import java.util.*;
class CreateStack{
	public static void main(String[] args){
		Stack<Object> st = new Stack<>();
		st.push(23);
		st.push('M');
		st.push(56.23);
		st.push("Mukesh");
		st.push(true);
		System.out.println("Our Stack : "+st);
	}
}