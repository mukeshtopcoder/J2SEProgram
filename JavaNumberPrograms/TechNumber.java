// Number : 2025
// Half of Number : 20+25 = 45
// Square of 45 is : 45*45 = 2025 (Tech Number)
import java.util.Scanner;
class TechNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		for(int i=0;i<temp;temp=temp/10){
			count++;
		}
		if(count%2==0){
			int div = (int)Math.pow(10,count/2);
			int firstHalf = num/div;
			int secondHalf = num%div;
			int num2 = firstHalf+secondHalf;
			int square = num2*num2;
			if(num==square)
				System.out.print("Tech Number");
			else
				System.out.print("Not Tech Number");
		}else{
			System.out.print("Not Tech Number");
		}
	}
}