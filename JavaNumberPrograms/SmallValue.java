// Find Smallest Value Among Three Using Ternary Operator
import java.util.Scanner;
class SmallValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		int a = sc.nextInt();
		System.out.print("Enter Value of B : ");
		int b = sc.nextInt();
		System.out.print("Enter Value of C : ");
		int c = sc.nextInt();
		int small = a<b?(a<c?a:c):(b<c?b:c);
		System.out.print("Smallest Value : "+small);
	}
}