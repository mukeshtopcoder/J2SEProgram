// Check Number is Positive, Negative or Zero
import java.util.Scanner;
class CheckNumberPositive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		if(num>0)
			System.out.print("Number is Positive");
		else if(num<0)
			System.out.print("Number is Negative");
		else
			System.out.print("Number is Zero");
	}
}