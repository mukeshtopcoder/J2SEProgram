// Xylem and Phloem
// 1335 its first and last digits sum are equal to its mean digits sum (1+5 == 3+3)
import java.util.Scanner;
class XylemAndPhloem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int temp = num;
		int mean=0;
		int side=0;
		for(int i=0;i<num;num=num/10){
			if((num<10)||(num==temp))
				side=side+num%10;
			else
				mean=mean+num%10;
		}
		if(side==mean)
			System.out.print("Number is Xylem");
		else
			System.out.print("Number is Phloem");
	}
}