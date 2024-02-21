// Sum of Natural NumbersS
import java.util.Scanner;
class SumOfNaturalNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range 1 to : ");
		int range = sc.nextInt();
		int sum = range*(range+1)/2;
		System.out.print("Sum is : "+sum);
	}
}