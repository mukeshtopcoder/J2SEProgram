// Number is : 123
// Reverse Number is : 321
import java.util.Scanner;
class ReverseANumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int rev=0;
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			rev = rev*10+rem;
		}
		System.out.print("Reverse Number : "+rev);
	}
}