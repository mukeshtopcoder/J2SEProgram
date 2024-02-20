// Number : 145
// Peterson Number : 1^3+4^3+5^3=145 (Number)
import java.util.Scanner;
class PetersonNumber{
	public static int fact(int num){
		int fa=1;
		for(int i=1;i<=num;i++)
			fa=fa*i;
		return fa;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int CopyNum = num;
		int cn = 0;
		for(int i=0;i<num;num=num/10){
			int rem = num%10;
			cn=cn+PetersonNumber.fact(rem);
		}
		if(cn==CopyNum)
			System.out.print("Peterson Number");
		else
			System.out.print("Not Peterson");
	}
}