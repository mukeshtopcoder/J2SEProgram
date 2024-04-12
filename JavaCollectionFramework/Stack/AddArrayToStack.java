//Write a Java program to add an ArrayList into Stack collection
import java.util.Stack;
class AddArrayToStack{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		int[] arr = {23,45,78,43,7,34};
		for(int i=0;i<arr.length;i++)
			st.push(arr[i]);
		System.out.println("Stack : "+st);
	}
}