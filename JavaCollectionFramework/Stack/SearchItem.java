//Write a Java program to search an item in a Stack collection
import java.util.Stack;
import java.util.Scanner;
class SearchItem{
	public static void main(String[] args){
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		st.push(23);
		st.push(36);
		st.push(67);
		st.push(27);
		st.push(49);
		st.push(73);
		System.out.println("Our Stack : "+st);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag=0;
		for(int i=0;i<st.size();i++)
			if(num==st.get(i)){
				System.out.println("Found on Index :"+i);
				flag=1;
			}
		if(flag==0)
			System.out.print("Element Not Found!");
	}
}