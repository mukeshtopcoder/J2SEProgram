// ISBN Number has (10 Digits) 3786483276
import java.util.Scanner;
class ISBNNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		long num = sc.nextLong();
		String str = Long.toString(num);
		if(str.length()==10)
			System.out.print("Valid ISBN");
		else
			System.out.print("Invalid ISBN");
	}
}