// Number 3,5,6 are the Evil Number because
// Binary representation of these numbers have even number of 1
// 011, 101, 110 has 2 1s in its representation
import java.util.Scanner;
class EvilNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int count = 0;
		if(num>0) {
			for(int i=0;i<num;num=num/2)
				if(num%2==1)
					count++;
			if(count%2==0)
				System.out.print("Evil Number");
			else
				System.out.print("Not Evil Number");
		}else{
			System.out.print("Not Evil Number");
		}
	}
}