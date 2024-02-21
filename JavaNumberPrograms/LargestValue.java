// Largest Value Among Three Numbers
import java.util.Scanner;
class LargestValue{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of A : ");
		int a = sc.nextInt();
		System.out.print("Enter Value of B : ");
		int b = sc.nextInt();
		System.out.print("Enter Value of C : ");
		int c = sc.nextInt();
		if( (a>b)&&(a>c) )
			System.out.print("Largest Value : "+a);
		else if( (b>a)&&(b>c) )
			System.out.print("Largest Value : "+b);
		else
			System.out.print("Largest Value : "+c);
	}
}