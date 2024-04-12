//Write a Java program to Reversing a String using a Stack
import java.util.Stack;
class ReverseStringUsingStack{
	public static void main(String[] args){
		Stack<Character> st = new Stack<>();
		String str = "HELLOWORLD";
		String rev = "";
		System.out.println("My String : "+str);
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		for(int i=0;i<str.length();i++)
			rev=rev+st.pop();
		System.out.print("Reverse String : "+rev);
	}
}