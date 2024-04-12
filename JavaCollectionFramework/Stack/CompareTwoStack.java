//Write a Java program to compare two Stack collections
import java.util.Stack;
class CompareTwoStack{
	public static void main(String[] args){
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		st1.add(24);
		st1.add(23);
		st1.add(34);
		st1.add(25);
		st1.add(31);
		st1.add(24);
		st2.add(13);
		st2.add(24);
		st2.add(34);
		st2.add(23);
		st2.add(53);
		st2.add(35);
		st2.add(64);
		System.out.println("Our 1st Stack : "+st1);
		System.out.println("Our 2nd Stack : "+st2);
		System.out.println("Our 1sr Stack Size : "+st1.size());
		System.out.println("Our 2nd Stack Size : "+st2.size());
		int count=0;
		for(int val1 : st1)
			for(int val2 : st2)
				if(val1==val2)
					count++;
		System.out.println("Elements Matched In Both Stack : "+count);
	}
}