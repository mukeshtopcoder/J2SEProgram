//Check A String is Palindrome
// MADAM reverse is also MADAM it is Palindrome
import java.util.Scanner;
class CheckPalindrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A String : ");
		String str = scan.next();
		int flag=1;
		int start = 0;
		int last = str.length()-1;
		while(start<last){
			if(str.charAt(start)!=str.charAt(last))
				flag=0;
			start++;
			last--;
		}
		if(flag==1)
			System.out.print("It is Palindrome");
		else
			System.out.print("It is not Palindrome");
	}
}