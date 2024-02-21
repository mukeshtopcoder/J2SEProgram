// Number : 1001,2338
// Strontio Number who has same value at tens and hundres place 1 '00' 1 and 2 '33' 8 are Strontio
import java.util.Scanner;
class StrontioNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		if(num>=100){
			if( ((num/10)%10)==((num/100)%10) )
				System.out.print("Strontio Number");
			else
				System.out.print("Not Strontio");
		}else{
			System.out.print("Not Strontio");
		}
	}
}