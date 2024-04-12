//Write a Java program to Checking Balanced Parentheses using a Stack
import java.util.Stack;
class CheckBalanceParentheses{
	public static void main(String[] args){
		Stack<Character> st = new Stack<>();
		String str = "(3+5)*(2-1)";
		int countOpen = 0;
		int countClose = 0;
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		for(int i=0;i<str.length();i++){
			char ch = st.pop();
			if(ch=='(')
				countOpen++;
			if(ch==')')
				countClose++;
		}
		if(countClose==countOpen)
			System.out.println("Balanced Parentheses");
		else
			System.out.println("Balanced Parentheses");
	}
}