// Divide String Into 'N' Equal Parts
import java.util.Scanner;
class DivideStringInEqualParts{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print("Enter Number To Divide String :  ");
		int n = sc.nextInt();
		int count=0;
		if(str.length()>=n){
			int divide = str.length()/n;
			for(int i=0;i<str.length();i++){
				System.out.print(str.charAt(i));
				if((i+1)%divide==0){
				System.out.println();
				count++;
				}
				if(count==n)
					break;
			}
		}else{
		System.out.print("String Length is "+str.length()+" It Can Not Be Divide To "+n+" Parts.");
		}
	}
}