// Alternative Prime Number In Range
import java.util.Scanner;
class AlternativePrime{
	public static boolean Prime(int n){
		for(int k=2;k<=n/2;k++)
			if(n%k==0)
				return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Range From 1 to: ");
		int num = sc.nextInt();
		int m=2;
		for(int i=2;i<=num;i++){
			if(PrimeRange.Prime(i)){
				if(m%2==0)
					System.out.print("  "+i);
				m=m+1;
			}
		}
	}
}