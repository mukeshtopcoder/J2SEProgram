//Write a Java program to Implement Min Stack
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;
class ImplementMinStack{
	public static void main(String[] args){
		MinStack st = new MinStack();
		st.push(58);
		st.push(78);
		st.push(13);
		st.push(62);
		st.push(23);
		int min = st.getMin();
		System.out.println("Minimum Value : "+min);
		System.out.print("Our MinStack : ");
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
	}
}
class MinStack{
	private Queue<Integer> que;
	MinStack(){
		que = new LinkedList<>();
	}
	public int pop(){
		return que.remove();
	}
	public void push(int z){
		que.add(z);
		int size = que.size();
		while(size>1){
			que.add(que.remove());
			size--;
		}
	}
	public int getMin(){
		return Collections.min(que);
	}
	public boolean isEmpty(){
		if(que.isEmpty())
			return true;
		else
			return false;
	}
}