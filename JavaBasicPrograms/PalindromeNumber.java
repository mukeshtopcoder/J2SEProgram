// 121 Reverse Number is : 121 Palindrom
// 123 Reverse Number is : 321 Not Palindrome
import java.util.Scanner;
class PalindromeNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int CopyNum = num;
		int sum = 0;
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			sum = sum*10+rem;
		}
		System.out.println("Reverse Number : "+sum);
		if(sum==CopyNum)
			System.out.print("Number is Palindrome");
		else
			System.out.print("Number is not Palindrome");
	}
}