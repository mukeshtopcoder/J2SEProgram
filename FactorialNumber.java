//Factorial Number : 5 = 5*4*3*2*1 : 120
import java.util.Scanner;
class FactorialNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++)
			fact*=i;
		System.out.print("Factorial : "+fact);
	}
}