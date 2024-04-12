//Write a Java program to Find Maximum Element in a Stack
import java.util.Stack;
class FindMax{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		st.push(23);
		st.push(56);
		st.push(63);
		st.push(54);
		st.push(16);
		st.push(54);
		System.out.println("Our Stack : "+st);
		int max = 0;
		if(st.size()>0)
			max=st.pop();
		while(!st.isEmpty()){
			int temp = st.pop();
			if(max<temp)
				max=temp;
		}
		System.out.print("Maximum Number : "+max);
	}
}