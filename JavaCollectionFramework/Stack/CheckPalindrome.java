//Write a Java program to Check Stack Palindrome or Not
import java.util.Stack;
class CheckPalindrome{
	public static void main(String[] args){
		Stack<Character> st = new Stack<>();
		String str = "NAMAN";
		String rev = "";
		for(int i=0;i<str.length();i++)
			st.push(str.charAt(i));
		while(0<st.size()){
			rev=rev+st.pop();
		}
		System.out.println("String : "+str);
		System.out.println("Reverse String : "+rev);	
		if(str.equals(rev))
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}