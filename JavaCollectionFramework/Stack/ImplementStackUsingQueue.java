//Write a Java program to Implement Stack using Queues
import java.util.Queue;
import java.util.LinkedList;
class ImplementStackUsingQueue{
	public static void main(String[] args){
		MyStack st = new MyStack();
		st.push(12);
		st.push(56);
		st.push(87);
		st.push(62);
		st.push(45);
		System.out.print("My Stack : ");
		while(!st.isEmpty())
			System.out.print(st.pop()+" ");
	}
}
class MyStack{
	private Queue<Integer> que;
	public MyStack(){
		que = new LinkedList<>();
	}
	public void push(int x){
		que.add(x);
		int size = que.size();
		while(size>1)
		{
			que.add(que.remove());
			size--;
		}
	}
	public int pop(){
		return que.remove();
	}
	public boolean isEmpty(){
		return que.isEmpty();
	}
}