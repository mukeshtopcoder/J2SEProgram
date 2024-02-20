// Number : 76
// Square : 5776
// 5776%100 = 76 is equal to Number(76)
// It is Automorphic Number
// Number : 23
// Square : 529
// 529%100 = 29 is not equal to Number(29)
// It is not a Automorphic Number
import java.util.Scanner;
class AutomorphicNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int square = num*num;
		int flag=1;
		while(num>0){
			if(!(square%10==num%10))
				flag=0;
			num=num/10;
			square=square/10;
		}
		if(flag==1)
			System.out.print("Automorphic Number");
		else
			System.out.print("Not Automorphic");
	}
}