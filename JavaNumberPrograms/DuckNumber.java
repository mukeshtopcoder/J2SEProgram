// Number : 460340, 4560340, 3000345, 4350345
// They all are Duck Number Because they have 0
// 035 Numbers are leading with 0 is not Duck
import java.util.Scanner;
class DuckNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=0;i<num;num=num/10){
			if(num%10==0)
				flag=1;
		}
		if(flag==1)
			System.out.print("Duck Number!");
		else
			System.out.print("Not Duck Number");
	}
}